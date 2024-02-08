package com.example.inventoryservice.web;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProductRestController {
    private ProductRepository productRepository;
    public ProductRestController(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }
    @GetMapping("products/{id}")
    public Product getProductById(String id) {
        return productRepository.findById(id).get();
    }

}
