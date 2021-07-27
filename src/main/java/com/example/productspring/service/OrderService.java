package com.example.productspring.service;

import com.example.productspring.model.Order;
import com.example.productspring.model.Product;
import com.example.productspring.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order takeOrder(List<Product> products) {
        String id = UUID.randomUUID().toString();
        Order newOrder = new Order(products, id);
        return orderRepository.addOrder(newOrder);
    }

    public List<Order> getAll() {
        return orderRepository.getOrderList();
    }
}
