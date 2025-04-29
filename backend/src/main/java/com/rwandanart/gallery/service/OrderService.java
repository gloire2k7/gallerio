package com.rwandanart.gallery.service;

import com.rwandanart.gallery.model.Order;
import com.rwandanart.gallery.model.User;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order createOrder(Order order);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
    Optional<Order> getOrderById(Long id);
    List<Order> getOrdersByUser(User user);
    List<Order> getOrdersByStatus(Order.OrderStatus status);
    Order updateOrderStatus(Long id, Order.OrderStatus status);
    long getOrderCount();
    double getTotalRevenue();
    List<Order> getRecentOrders(int limit);
} 