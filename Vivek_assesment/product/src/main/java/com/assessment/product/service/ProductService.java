package com.assessment.product.service;

import java.util.List;

import com.assessment.product.entities.Product;

public interface ProductService {

	// Create
	public Product addProduct(Product product);

	// Retrieve all users
	public List<Product> getAllProducts();
}
