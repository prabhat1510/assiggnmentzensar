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

import com.example.product.entities.Product;
import com.example.product.exception.ProductNotFound;
import com.example.product.exception.ProductNotUpdated;
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

	
	//http://localhost:9090/api/v1/product/2
	@GetMapping("/{productId}")
	public Product retrieveProduct(@PathVariable Integer productId) throws ProductNotFound {

		return productService.getProduct(productId);
	}
	@DeleteMapping("/delete/{productId}")
	public String deleteProduct(@PathVariable Integer productId) {

		return productService.deleteProduct(productId);
	}
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product product) throws ProductNotUpdated {
		return productService.updateProduct(product);
	}
	
}