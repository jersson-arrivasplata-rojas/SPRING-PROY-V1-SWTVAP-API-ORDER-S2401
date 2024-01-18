package com.jersson.arrivasplata.swtvap.api.order.expose;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import reactor.core.publisher.Mono;

public interface OrderTransactionController {
    Mono<OrderTransaction> getOrderTransactionById(Long id);

    Mono<OrderTransaction> createOrderTransaction(OrderTransaction orderTransaction);

    Mono<OrderTransaction> updateOrderTransaction(Long id, OrderTransaction updatedOrderTransaction);

    Mono<Void> deleteOrderTransaction(Long id);
}
