package com.product.microservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.microservice.entities.Product;
import com.product.microservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) repository.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product getProductId(Integer id) {
		Optional<Product> product = repository.findById(id);
		
		if(product.isPresent()) {
			return product.get();
		} else {
			return null;
		}
	}

}
