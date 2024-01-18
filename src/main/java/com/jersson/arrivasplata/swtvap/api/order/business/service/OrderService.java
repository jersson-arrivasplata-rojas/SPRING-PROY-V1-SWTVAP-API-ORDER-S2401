package com.jersson.arrivasplata.swtvap.api.order.business.service;

import com.jersson.arrivasplata.swtvap.api.order.model.Order;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Flux<Order> getAllOrders();
    Mono<Order> getOrderById(Long id);
    Mono<Order> createOrder(Order order);
    Mono<Order> updateOrder(Long id, Order order);
    Mono<Void> deleteOrder(Long id);
}
