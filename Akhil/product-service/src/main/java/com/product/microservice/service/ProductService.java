package com.product.microservice.service;

import java.util.List;

import com.product.microservice.entities.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public Product addProduct(Product product);
	public Product getProductId(Integer id);

}
