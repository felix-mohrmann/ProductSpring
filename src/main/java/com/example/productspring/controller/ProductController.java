package com.example.productspring.controller;

import com.example.productspring.model.Product;
import com.example.productspring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> allProducts(){
        return productService.list();
    }

    @GetMapping("/search")
    public String getProductByName(@RequestParam (name="name") String name){
        return productService.searchProduct(name);
    }
}
