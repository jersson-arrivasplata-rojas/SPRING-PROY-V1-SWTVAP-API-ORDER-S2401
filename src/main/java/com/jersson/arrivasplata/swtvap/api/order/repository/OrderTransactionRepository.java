package com.jersson.arrivasplata.swtvap.api.order.repository;

import com.jersson.arrivasplata.swtvap.api.order.model.OrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Long> {
    List<OrderTransaction> findAll();
    void deleteById(Long id);

    List<OrderTransaction> findByOrderName(String orderName);

}
