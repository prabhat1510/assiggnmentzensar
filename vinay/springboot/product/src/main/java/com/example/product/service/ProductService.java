package com.example.product.service;

import java.util.List;

import com.example.product.entites.Product;

public interface ProductService {
	//Create
		public Product addProduct(Product product);
		//Retrieve
		public Product retrieveProduct(Integer productId);
		//Delete
		public String deleteProduct(Integer productId);
		
		//Update
		public String updateProduct(Product product);
		
		//Retrieve all books
		public List<Product> getAllProducts();
}
