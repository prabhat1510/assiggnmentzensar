package com.assessment.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.product.entities.Product;
import com.assessment.product.service.*;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;

	// Create
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return productservice.addProduct(product);
	}

	// Receiving data from client
	@RequestMapping(value = "/allproducts", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Product> getProducts() {
		return productservice.getAllProducts();
	}
}
