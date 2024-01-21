package com.jersson.arrivasplata.swtvap.api.order.business.implementation;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderAmountService;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import com.jersson.arrivasplata.swtvap.api.order.repository.OrderAmountRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrderAmountServiceImpl implements OrderAmountService {
    private final OrderAmountRepository orderAmountRepository;

    public OrderAmountServiceImpl(OrderAmountRepository orderAmountRepository) {
        this.orderAmountRepository = orderAmountRepository;
    }

    @Override
    public Flux<OrderAmount> findAll() {
        return Flux.fromIterable(orderAmountRepository.findAll());
    }

    @Override
    public Mono<OrderAmount> findById(Long id) {
        return Mono.justOrEmpty(orderAmountRepository.findById(id));
    }

    @Override
    public Mono<OrderAmount> save(OrderAmount orderAmount) {
        return Mono.justOrEmpty(orderAmountRepository.save(orderAmount));
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        orderAmountRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Flux<OrderAmount> findByOrderCode(String orderCode) {
        return Flux.fromIterable(orderAmountRepository.findByOrderCode(orderCode));
    }
}
