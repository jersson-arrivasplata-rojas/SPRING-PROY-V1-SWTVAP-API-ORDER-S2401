package com.jersson.arrivasplata.swtvap.api.order.business.implementation;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderAmountService;
import com.jersson.arrivasplata.swtvap.api.order.exception.CustomException;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import com.jersson.arrivasplata.swtvap.api.order.repository.OrderAmountRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class OrderAmountServiceImpl implements OrderAmountService {
    private final OrderAmountRepository orderAmountRepository;

    public OrderAmountServiceImpl(OrderAmountRepository orderAmountRepository) {
        this.orderAmountRepository = orderAmountRepository;
    }

    @Override
    public Flux<OrderAmount> getAllOrderAmount() {
        return Flux.fromIterable(orderAmountRepository.findAll());
    }

    @Override
    public Mono<OrderAmount> getOrderAmountById(Long id) {
        return Mono.justOrEmpty(orderAmountRepository.findById(id));
    }

    @Override
    public Mono<OrderAmount> createOrderAmount(OrderAmount orderAmount) {
        return Mono.justOrEmpty(orderAmountRepository.save(orderAmount));
    }

    @Override
    public Mono<OrderAmount> updateOrderAmount( OrderAmount orderAmount) {
        if (orderAmount.getName() == null || orderAmount.getName().isEmpty()) {
            throw new CustomException("Product name is required.");
        }
        // Resto de la lógica para actualizar un producto
        return Mono.just(orderAmountRepository.save(orderAmount));
    }

    @Override
    public Mono<Void> deleteOrderAmount(Long id) {
        orderAmountRepository.deleteById(id);
        return Mono.empty();
    }

    @Override
    public Flux<OrderAmount> findByOrderCode(String orderCode) {
        return Flux.fromIterable(orderAmountRepository.findByOrderCode(orderCode));
    }
}
