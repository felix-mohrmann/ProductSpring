package com.example.productspring.repository;

import com.example.productspring.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private final List<Order> orderList = new ArrayList<>();

    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }

    public List<Order> getOrderList(){
        return orderList;
    }
}
