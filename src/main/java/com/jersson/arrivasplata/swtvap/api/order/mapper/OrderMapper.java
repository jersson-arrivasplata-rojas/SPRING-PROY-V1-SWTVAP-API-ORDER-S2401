package com.jersson.arrivasplata.swtvap.api.order.mapper;

import com.jersson.arrivasplata.swtvap.api.order.model.Order;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderRequestToOrder(OrderRequest orderRequest);

    OrderRequest orderToOrderRequest(Order order);

    OrderResponse orderToOrderResponse(Order order);

    List<OrderResponse> mapOrdersToResponses(List<Order> orders);

}
