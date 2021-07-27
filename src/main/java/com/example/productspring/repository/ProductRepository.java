package com.example.productspring.repository;

import com.example.productspring.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    List<Product> productList;

    public ProductRepository() {
        productList = new ArrayList<>(List.of(
                new Product ("waschlappen", "1"),
                new Product ("handtuch", "2")
        ));
    }

    public List<Product> getProductList(){
        return productList;
    }

    public String searchProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)){
                return product.getName();
            }
        }
        return "Product not found";
        //throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
