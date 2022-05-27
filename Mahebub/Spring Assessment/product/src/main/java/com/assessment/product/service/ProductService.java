package com.assessment.product.service;

import java.util.List;

import com.assessment.product.entities.Product;

public interface ProductService {
	// Create
	public Product addProduct(Product product);

	// Retrieve
	public Product retrieveProduct(Integer productid);

	// Delete
	public String deleteProduct(Integer productid);

	// Update
	public String updateProduct(Product product);

	// get all Products
	public List<Product> getAllProduct();
}
