package com.spring.product.service;

import java.util.List;
import java.util.Optional;

import com.spring.product.model.Product;

public interface ProductService {
    public Optional<Product> findById(Integer id);
    
    public Product saveProduct(Product product);
    
    public List<Product> getAllProduct();


}
