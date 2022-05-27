package com.assessment.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.product.entities.Product;
import com.assessment.product.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	ProductService productService;

	// Create
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	// Retrieve
	@GetMapping("/{productid}")
	public Product retrieveProduct(@PathVariable Integer productid) {

		return productService.retrieveProduct(productid);
	}

	// Delete
	@DeleteMapping("/removeproduct/{productid}")
	public String deleteProduct(@PathVariable Integer productid) {

		return productService.deleteProduct(productid);
	}

	// Update
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	// Returns all Product details
	@RequestMapping(value = "/details", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Product> getProduct() {
		return productService.getAllProduct();
	}
}
