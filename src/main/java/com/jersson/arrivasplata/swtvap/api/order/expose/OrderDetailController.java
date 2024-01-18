package com.jersson.arrivasplata.swtvap.api.order.expose;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import reactor.core.publisher.Mono;

public interface OrderDetailController {
    Mono<OrderDetail> getOrderDetailById(Long id);

    Mono<OrderDetail> createOrderDetail(OrderDetail orderDetail);

    Mono<OrderDetail> updateOrderDetail(Long id, OrderDetail updatedOrderDetail);

    Mono<Void> deleteOrderDetail(Long id);
}
