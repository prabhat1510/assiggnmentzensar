package com.example.product.service;


import java.util.List;
import java.util.Optional;

import com.example.product.entities.Product;

public interface ProductService {
    public Optional<Product> findById(Long id);
    
    public Product saveProduct(Product product);
    
    public List<Product> getAllProduct();


}
