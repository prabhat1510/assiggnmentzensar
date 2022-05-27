package com.product.entity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entities.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	ProductService catService;
	
	
	@GetMapping("/products")
	public List<Product> allProducts() {
		List<Product> products = catService.allProducts();
		return products;
	}

}


