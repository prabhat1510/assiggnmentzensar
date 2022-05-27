package com.example.product.service;

import java.util.List;

import com.example.product.entities.Product;
import com.example.product.exception.ProductNotFound;
import com.example.product.exception.ProductNotUpdated;

public interface ProductService {
public Product addProduct(Product product);
	
	public Product getProduct(Integer productId) throws ProductNotFound;
	
	public String deleteProduct(Integer productId);
	
	public String updateProduct(Product product) throws ProductNotUpdated;
	
	public List<Product> getAllProducts();

}
