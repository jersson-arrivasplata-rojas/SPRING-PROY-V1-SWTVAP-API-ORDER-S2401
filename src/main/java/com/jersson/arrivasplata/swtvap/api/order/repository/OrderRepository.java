package com.jersson.arrivasplata.swtvap.api.order.repository;

import com.jersson.arrivasplata.swtvap.api.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

    Order findByCode(String code);

}
