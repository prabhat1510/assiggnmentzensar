package com.assessment.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.product.entities.Product;
import com.assessment.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	@Override
	public Product retrieveProduct(Integer productid) {
		Optional<Product> product = productRepository.findById(productid);
		return product.get();
	}

	@Override
	public String deleteProduct(Integer productid) {
		if(productid != null) {
			productRepository.deleteById(productid);
			return "Product with productid ---" + productid + "  deleted successfully";
		}
		else {
			return "Unable to detele Product with productid "+productid;
		}
	}

	@Override
	public String updateProduct(Product product) {
		Optional<Product> pdt = productRepository.findById(product.getProductid());
		if (pdt.isPresent()) {
			Product p = productRepository.save(product);
			if (p != null) {
				return "Product entity updated successfully";
			} else {
				return "Product entity not updated successfully";
			}
		} else {
			return "Product with productid ---" + product.getProductid() + "  cannot be update as it doesn't exists";
		}

	}

	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.findAll();
	}
}
