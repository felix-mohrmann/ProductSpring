package com.example.productspring.service;

import com.example.productspring.model.Product;
import com.example.productspring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> list(){
        return productRepository.getProductList();
    }

    public String searchProduct(String name) {
        return productRepository.searchProduct(name);
    }
}
