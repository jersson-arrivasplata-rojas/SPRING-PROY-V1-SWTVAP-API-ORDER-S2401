package com.jersson.arrivasplata.swtvap.api.order.expose;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetailRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetailResponse;
import reactor.core.publisher.Mono;

public interface OrderDetailController {
    Mono<OrderDetailResponse> getOrderDetailById(Long id);

    Mono<OrderDetailResponse> createOrderDetail(OrderDetailRequest orderDetailRequest);

    Mono<OrderDetailResponse> updateOrderDetail(Long id, OrderDetailRequest updatedOrderDetailRequest);

    Mono<Void> deleteOrderDetail(Long id);
}
