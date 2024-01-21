package com.jersson.arrivasplata.swtvap.api.order.business.service;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderAmountService {
    Flux<OrderAmount> findAll();

    Mono<OrderAmount> findById(Long id);

    Mono<OrderAmount> save(OrderAmount orderAmount);

    Mono<Void> deleteById(Long id);

    Flux<OrderAmount> findByOrderCode(String orderCode);
}
