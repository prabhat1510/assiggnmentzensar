package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entites.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
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
		return "product with productId ---" + productId + "  deleted successfully";
	}

	@Override
	public String updateProduct(Product product) {
		Optional<Product> bok = productRepository.findById(product.getProductId());
		if (bok.isPresent()) {
			Product bk = productRepository.save(product);
			if (bk != null) {
				return "Product entity updated successfully";
			} else {
				return "Product entity not updated successfully";
			}
		} else {
			return "Product withProductId ---" + product.getProductId() + "  cannot be update as it doesn't exists";
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

}
