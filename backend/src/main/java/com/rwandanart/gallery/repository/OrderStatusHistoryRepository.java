package com.rwandanart.gallery.repository;

import com.rwandanart.gallery.model.Order;
import com.rwandanart.gallery.model.OrderStatusHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderStatusHistoryRepository extends JpaRepository<OrderStatusHistory, Long> {
    List<OrderStatusHistory> findByOrderOrderByCreatedAtDesc(Order order);
} 