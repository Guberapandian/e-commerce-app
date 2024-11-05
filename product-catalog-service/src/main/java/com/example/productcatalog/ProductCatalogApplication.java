package com.example.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProductCatalogApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogApplication.class, args);
    }

    @GetMapping("/products")
    public String getProducts() {
        return "Product Catalog Service: List of products";
    }
}
