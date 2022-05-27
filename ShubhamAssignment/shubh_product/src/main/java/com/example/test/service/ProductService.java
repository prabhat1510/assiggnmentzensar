package com.example.test.service;

import java.util.List;

import com.example.test.entities.Product;
import com.example.test.exceptions.NoDataFoundException;

public interface ProductService {

	public List<Product> getAllProduct();
	public Product addProduct(Product products);
	public Product getProduct(Integer id) throws NoDataFoundException;
	public String updateProduct(Integer id, Product products) throws NoDataFoundException;
	public List<Product> searchProduct(String query) throws NoDataFoundException;
}
