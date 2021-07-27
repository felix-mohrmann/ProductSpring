package com.example.productspring.controller;

import com.example.productspring.model.Order;
import com.example.productspring.model.Product;
import com.example.productspring.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order newOrder(@RequestBody List<Product> products) {
        return orderService.takeOrder(products);
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAll();
    }
}
