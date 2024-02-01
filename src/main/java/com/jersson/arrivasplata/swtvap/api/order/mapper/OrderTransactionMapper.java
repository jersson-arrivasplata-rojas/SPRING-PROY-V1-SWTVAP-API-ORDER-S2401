package com.jersson.arrivasplata.swtvap.api.order.mapper;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransactionRequest;
import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransactionResponse;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")

public interface OrderTransactionMapper {
    OrderTransaction orderTransactionRequestToOrderTransaction(OrderTransactionRequest orderTransactionRequest);

    OrderTransactionRequest orderTransactionToOrderTransactionRequest(OrderTransaction orderTransaction);

    OrderTransactionResponse orderTransactionToOrderTransactionResponse(OrderTransaction orderTransaction);

    List<OrderTransactionResponse> mapOrderTransactionToResponses(List<OrderTransaction> orderTransaction);
}
