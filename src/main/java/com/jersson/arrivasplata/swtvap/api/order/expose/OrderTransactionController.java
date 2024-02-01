package com.jersson.arrivasplata.swtvap.api.order.expose;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransactionRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransactionResponse;
import reactor.core.publisher.Mono;

public interface OrderTransactionController {
    Mono<OrderTransactionResponse> getOrderTransactionById(Long id);

    Mono<OrderTransactionResponse> createOrderTransaction(OrderTransactionRequest orderTransactionRequest);

    Mono<OrderTransactionResponse> updateOrderTransaction(Long id, OrderTransactionRequest updatedOrderTransactionRequest);

    Mono<Void> deleteOrderTransaction(Long id);
}
