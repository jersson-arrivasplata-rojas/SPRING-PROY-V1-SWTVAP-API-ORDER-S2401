package com.jersson.arrivasplata.swtvap.api.order.business.service;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderDetailService {
    Flux<OrderDetail> findAll();

    Mono<OrderDetail> findById(Long id);

    Mono<OrderDetail> save(OrderDetail orderDetail);

    Mono<Void> deleteById(Long id);

    Flux<OrderDetail> findByOrderDetailName(String orderDetailName);
}
