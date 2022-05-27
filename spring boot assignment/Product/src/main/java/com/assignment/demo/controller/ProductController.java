package com.assignment.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.assignment.demo.entities.Product;
import com.assignment.demo.service.ProductService;

public class ProductController {
	@Autowired
	ProductService productService;
	
	//Create
	@PostMapping("/addproduct")
	public Product addBook(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	//Retrieve
	@GetMapping("/{productId}")
	public Product retrieveProduct(@PathVariable Integer productId) {
		
		return productService.retrieveProduct(productId);
	}
	//Delete
	@DeleteMapping("/removeproduct/{productId}")
	public String deleteProduct(@PathVariable Integer productId) {
		
		return productService.deleteProduct(productId);
	}
}
