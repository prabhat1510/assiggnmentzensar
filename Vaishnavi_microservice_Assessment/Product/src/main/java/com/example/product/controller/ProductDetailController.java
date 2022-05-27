package com.example.product.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entities.Product;
import com.example.product.service.ProductService;



@RestController
@RequestMapping("/api/product")
public class ProductDetailController {
	
	private ProductService productService;

	@GetMapping("/")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();

	}

	@GetMapping("/id")
	public Optional<Product> getProductById(@PathVariable Long id) {
		return productService.findById(id);

	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

}