package com.jersson.arrivasplata.swtvap.api.order.business.implementation;

import com.jersson.arrivasplata.swtvap.api.order.business.service.OrderService;
import com.jersson.arrivasplata.swtvap.api.order.enums.Status;
import com.jersson.arrivasplata.swtvap.api.order.exception.CustomException;
import com.jersson.arrivasplata.swtvap.api.order.model.Order;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderResponse;
import com.jersson.arrivasplata.swtvap.api.order.repository.OrderRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Flux<Order> getAllOrders() {
        return Flux.fromIterable(orderRepository.findAll());
    }

    @Override
    public Mono<Order> getOrderById(Long id) {
        return Mono.just(orderRepository.findById(id)
                .orElseThrow(() -> new CustomException("Order not found with id: " + id)));

    }

    @Override
    public Mono<Order> createOrder(Order order) {
        if (order.getCode() == null || order.getCode().isEmpty()) {
            throw new CustomException("Order name is required.");
        }
        return Mono.just(orderRepository.save(order));
    }

    @Override
    public Mono<Order> updateOrder(Long id, Order order) {
        if (order.getCode() == null || order.getCode().isEmpty()) {
            throw new CustomException("Order name is required.");
        }
        return Mono.just(orderRepository.save(order));
    }

    @Override
    public Mono<Void> deleteOrder(Long id) {
        Optional<Order> orderOptional = orderRepository.findById(id);
        if (!orderOptional.isPresent()) {
            throw new CustomException("Orer not found with id: " + id);
        }
        Order order = orderOptional.get();
        order.setStatus(Status.INACTIVE);
        orderRepository.save(order);

        return Mono.empty();
    }

    public Order getOrderByCode(String code) {
        return orderRepository.findByCode(code);
    }

}
