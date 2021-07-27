package com.example.productspring.model;

import java.util.List;

public class Order {

    private final List<Product> products;
    private final String id;

    public Order(List<Product> products, String id) {
        this.products = products;
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getId() {
        return id;
    }
}
