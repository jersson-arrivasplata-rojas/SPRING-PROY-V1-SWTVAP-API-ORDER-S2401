package com.jersson.arrivasplata.swtvap.api.order.expose;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import reactor.core.publisher.Mono;

public interface OrderAmountController {
    Mono<OrderAmount> getOrderAmountById(Long id);

    Mono<OrderAmount> createOrderAmount(OrderAmount orderAmount);

    Mono<OrderAmount> updateOrderAmount(Long id, OrderAmount updatedOrderAmount);

    Mono<Void> deleteOrderAmount(Long id);
}
