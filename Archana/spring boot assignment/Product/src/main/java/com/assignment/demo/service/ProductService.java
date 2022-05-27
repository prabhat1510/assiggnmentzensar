package com.assignment.demo.service;

import com.assignment.demo.entities.Product;

public interface ProductService {
	//Create
		public Product addProduct(Product product);
		//Retrieve
		public Product retrieveProduct(Integer productId);
		//Delete
		public String deleteProduct(Integer productId);
		
}
