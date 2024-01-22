package com.jersson.arrivasplata.swtvap.api.order.expose.controllers;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderTransactionService;
import com.jersson.arrivasplata.swtvap.api.order.expose.OrderTransactionController;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/order-transactions", produces = "application/vnd.swtvap-api-order-transactions.v1+json")

public class OrderTransactionControllerImpl implements OrderTransactionController {
    private final OrderTransactionService orderTransactionService;

    public OrderTransactionControllerImpl(OrderTransactionService orderTransactionService) {
        this.orderTransactionService = orderTransactionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<OrderTransaction> getAllOrderTransaction() {
        return orderTransactionService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderTransaction> getOrderTransactionById(@PathVariable Long id) {
        return orderTransactionService.findById(id)
                .map(orderTransaction -> orderTransaction);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderTransaction> createOrderTransaction(@RequestBody OrderTransaction orderTransaction) {
        return orderTransactionService.save(orderTransaction)
                .map(newOrderTransaction -> newOrderTransaction);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderTransaction> updateOrderTransaction(@PathVariable Long id, @RequestBody OrderTransaction updatedOrderTransaction) {
        return orderTransactionService.findById(id)
                .flatMap(existingOrderTransaction -> {
                    updatedOrderTransaction.setOrderTransactionId(id);
                    return orderTransactionService.save(updatedOrderTransaction);
                })
                .map(updated -> updated);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteOrderTransaction(@PathVariable Long id) {
        return orderTransactionService.findById(id)
                .flatMap(existingOrderTransaction -> {
                    orderTransactionService.deleteById(id);
                    return Mono.empty();
                });
    }
}
