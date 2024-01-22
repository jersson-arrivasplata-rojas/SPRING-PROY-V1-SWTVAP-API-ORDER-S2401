package com.jersson.arrivasplata.swtvap.api.order.expose.controllers;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderAmountService;
import com.jersson.arrivasplata.swtvap.api.order.expose.OrderAmountController;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/order-amounts", produces = "application/vnd.swtvap-api-order-amounts.v1+json")
public class OrderAmountControllerImpl implements OrderAmountController {
    private final OrderAmountService orderAmountService;

    public OrderAmountControllerImpl(OrderAmountService orderAmountService) {
        this.orderAmountService = orderAmountService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<OrderAmount> getAllOrderAmount() {
        return orderAmountService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderAmount> getOrderAmountById(@PathVariable Long id) {
        return orderAmountService.findById(id)
                .map(orderAmount -> orderAmount);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderAmount> createOrderAmount(@RequestBody OrderAmount orderAmount) {
        return orderAmountService.save(orderAmount)
                .map(newOrderCategory -> newOrderCategory);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderAmount> updateOrderAmount(@PathVariable Long id,@RequestBody OrderAmount updatedOrderAmount) {
        return orderAmountService.findById(id)
                .flatMap(existingOrderAmount -> {
                    updatedOrderAmount.setOrderId(id);
                    return orderAmountService.save(updatedOrderAmount);
                })
                .map(updated -> updated);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteOrderAmount(@PathVariable Long id) {
        return orderAmountService.findById(id)
                .flatMap(existingOrderAmount -> {
                    orderAmountService.deleteById(id);
                    return Mono.empty();
                });
    }
}
