package com.jersson.arrivasplata.swtvap.api.order.repository;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderAmount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderAmountRepository extends JpaRepository<OrderAmount,Long> {
    List<OrderAmount> findAll();
    void deleteById(Long id);

    List<OrderAmount> findByOrderName(String orderName);

}
