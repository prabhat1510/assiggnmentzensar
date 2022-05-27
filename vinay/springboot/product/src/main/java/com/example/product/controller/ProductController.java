package com.example.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entites.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping(value="/api/v1/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	//Create
		@PostMapping("/addproduct")
		public Product addProduct(@RequestBody Product product) {
			return productService.addProduct(product);
			}

		//Retrieve
		@GetMapping("/{productId}")
		public Product retrieveProduct(@PathVariable Integer productId) {
			
			return productService.retrieveProduct(productId);
		}
		@DeleteMapping("/removeproduct/{productId}")
		public String deleteProduct(@PathVariable Integer productId) {
			
			return productService.deleteProduct(productId);
		}
		@PutMapping("/productbook")
		public String updateProduct(@RequestBody Product product) {
			return productService.updateProduct(product);
		}
}