package com.assessment.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.product.entities.Product;
import com.assessment.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productrepo;

	@Override
	public Product addProduct(Product product) {
		return productrepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productrepo.findAll();
	}

}
