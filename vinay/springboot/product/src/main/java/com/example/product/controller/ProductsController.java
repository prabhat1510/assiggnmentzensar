package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entites.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductsController {

	@Autowired
	ProductService productService;
	//Receiving data from client
		@RequestMapping(value="/api/v2/product/allproducts", 
					method=RequestMethod.GET,
					consumes= {MediaType.APPLICATION_XML_VALUE},
					produces={MediaType.APPLICATION_XML_VALUE})
			public List<Product> getBooks(){
				return productService.getAllProducts();
			}
}
