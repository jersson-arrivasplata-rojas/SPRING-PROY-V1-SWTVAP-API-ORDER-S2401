package com.jersson.arrivasplata.swtvap.api.order.business.implementation;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderTransactionService;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import com.jersson.arrivasplata.swtvap.api.order.repository.OrderTransactionRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrderTransactionServiceImpl implements OrderTransactionService {
    private final OrderTransactionRepository orderTransactionRepository;

    public OrderTransactionServiceImpl(OrderTransactionRepository orderTransactionRepository) {
        this.orderTransactionRepository = orderTransactionRepository;
    }

    @Override
    public Flux<OrderTransaction> findAll() {
        return Flux.fromIterable(orderTransactionRepository.findAll());
    }

    @Override
    public Mono<OrderTransaction> findById(Long id) {
        return Mono.justOrEmpty(orderTransactionRepository.findById(id));
    }

    @Override
    public Mono<OrderTransaction> save(OrderTransaction orderTransaction) {
        return Mono.justOrEmpty(orderTransactionRepository.save(orderTransaction));
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        orderTransactionRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Flux<OrderTransaction> findByOrderCode(String orderCode) {
        return Flux.fromIterable(orderTransactionRepository.findByOrderCode(orderCode));
    }
}