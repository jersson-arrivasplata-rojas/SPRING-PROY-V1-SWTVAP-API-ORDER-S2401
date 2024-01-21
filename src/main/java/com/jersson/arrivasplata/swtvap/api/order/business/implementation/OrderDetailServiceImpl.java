package com.jersson.arrivasplata.swtvap.api.order.business.implementation;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderDetailService;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import com.jersson.arrivasplata.swtvap.api.order.repository.OrderDetailRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;

    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public Flux<OrderDetail> findAll() {
        return Flux.fromIterable(orderDetailRepository.findAll());
    }

    @Override
    public Mono<OrderDetail> findById(Long id) {
        return Mono.justOrEmpty(orderDetailRepository.findById(id));
    }

    @Override
    public Mono<OrderDetail> save(OrderDetail orderDetail) {
        return Mono.justOrEmpty(orderDetailRepository.save(orderDetail));
    }

    @Override
    public Mono<Void> deleteById(Long id) {
        orderDetailRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Flux<OrderDetail> findByOrderCode(String orderCode) {
        return Flux.fromIterable(orderDetailRepository.findByOrderCode(orderCode));

    }
}
