package com.ProductDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProductDetails.Service.ProductService;

@RestController
public class ProductController<product> {

	@Autowired
	ProductService ProductService;
	// URL - http://localhost:9001//api/productid
	//Create
	@PostMapping("/product/pid")
	public product addproduct(@RequestBody  product  pd) {
		return ProductService.add(pd);
	}
	//Retrieve
	@GetMapping("/{pname}")
	public product retrieveproduct(@PathVariable Integer pId) {
		
		return  ProductService.retrieveProduct(pId);
	}
	//Delete
	@DeleteMapping("/removeproduct/{pId}")
	public String deleteproduct(@PathVariable Integer pId) {
		
		return ProductService.deleteproduct(pId);
	}
	
	//Update
	@PutMapping("/updateproduct")
	public String updateproduct(@RequestBody product  pd) {
		return ProductService.updateproduct(pd);
	}
	
}

