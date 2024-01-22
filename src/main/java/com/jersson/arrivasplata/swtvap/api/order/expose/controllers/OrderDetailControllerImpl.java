package com.jersson.arrivasplata.swtvap.api.order.expose.controllers;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderDetailService;
import com.jersson.arrivasplata.swtvap.api.order.expose.OrderDetailController;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/order-details", produces = "application/vnd.swtvap-api-order-details.v1+json")
public class OrderDetailControllerImpl implements OrderDetailController {
    private final OrderDetailService orderDetailService;

    public OrderDetailControllerImpl(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<OrderDetail> getAllOrderDetail() {
        return orderDetailService.findAll();
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderDetail> getOrderDetailById(@PathVariable Long id) {
        return orderDetailService.findById(id)
                .map(orderDetail -> orderDetail);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<OrderDetail> createOrderDetail(@RequestBody OrderDetail orderDetail) {
        return orderDetailService.save(orderDetail)
                .map(newOrderDetail -> newOrderDetail);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OrderDetail> updateOrderDetail(@PathVariable Long id,@RequestBody OrderDetail updatedOrderDetail) {
        return orderDetailService.findById(id)
                .flatMap(existingOrderDetail -> {
                    updatedOrderDetail.setOrderId(id);
                    return orderDetailService.save(updatedOrderDetail);
                })
                .map(updated -> updated);
    }

    @Override
    public Mono<Void> deleteOrderDetail(Long id) {
        return orderDetailService.findById(id)
                .flatMap(existingOrderDetail -> {
                    orderDetailService.deleteById(id);
                    return Mono.empty();
                });
    }
}
