package com.assignment.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.entities.Product;
import com.assignment.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product retrieveProduct(Integer productId) {
		Optional<Product> product = productRepository.findById(productId);
		if (product.isPresent()) {
			return product.get();
		} else {
			return null;
		}

	}

	@Override
	public String deleteProduct(Integer productId) {
		productRepository.deleteById(productId);
		return "Product with productId ---" + productId + "  deleted successfully";
	}

}