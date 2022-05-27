package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entities.Product;
import com.product.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> allProducts()
	{
		return (List<Product>) repository.findAll();
	}

}


