package com.jersson.arrivasplata.swtvap.api.order.mapper;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetail;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetailRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderDetailResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")

public interface OrderDetailMapper {
    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);
    @Mapping(source = "orderDetailId", target = "orderDetailId")
    @Mapping(source = "orderId", target = "orderId")
    @Mapping(source = "productId", target = "productId")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "unitPrice", target = "unitPrice")
    @Mapping(source = "subtotal", target = "subtotal")
    @Mapping(source = "discountPercentage", target = "discountPercentage")
    @Mapping(source = "otherDetails", target = "otherDetails")
    @Mapping(source = "status", target = "status")
    OrderDetail orderDetailRequestToOrderDetail(OrderDetailRequest orderDetailRequest);
    @Mapping(source = "orderDetailId", target = "orderDetailId")
    @Mapping(source = "orderId", target = "orderId")
    @Mapping(source = "productId", target = "productId")
    @Mapping(source = "quantity", target = "quantity")
    @Mapping(source = "unitPrice", target = "unitPrice")
    @Mapping(source = "subtotal", target = "subtotal")
    @Mapping(source = "discountPercentage", target = "discountPercentage")
    @Mapping(source = "otherDetails", target = "otherDetails")
    @Mapping(source = "status", target = "status")
    OrderDetailRequest orderDetailToOrderDetailRequest(OrderDetail orderDetail);

    OrderDetailResponse orderDetailToOrderDetailResponse(OrderDetail orderDetail);

    List<OrderDetailResponse> mapOrderDetailsToResponses(List<OrderDetail> orderDetails);


}
