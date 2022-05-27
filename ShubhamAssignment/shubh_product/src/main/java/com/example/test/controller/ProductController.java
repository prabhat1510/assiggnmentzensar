package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.test.entities.Product;
import com.example.test.exceptions.NoDataFoundException;
import com.example.test.service.ProductService;

public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product products) {
		return productService.addProduct(products);
	}
	
	@PutMapping("/product/{id}")
	public String updateProduct(@PathVariable Integer id, @RequestBody Product products) throws NoDataFoundException {
		return productService.updateProduct(id, products);
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) throws NoDataFoundException {
		return productService.getProduct(id);
	}
	
//	@GetMapping("/product")
//	public List<Product> getProduct() {
//		List<Product> adv = productService.getProduct();
//		
//		return adv;
//	}
	
	@GetMapping("/product/search/{query}")
	public List<Product> searchProduct(@PathVariable String query) throws NoDataFoundException {
		List<Product> adv = productService.searchProduct(query);
		return adv;
	}
}
