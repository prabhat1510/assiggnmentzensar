package com.example.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entities.Product;
import com.example.product.exception.ProductNotFound;
import com.example.product.exception.ProductNotUpdated;
import com.example.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository repository;

	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public Product getProduct(Integer productId) throws ProductNotFound {
		Optional<Product> product=repository.findById(productId);
		if(product.isPresent())
		{
			return product.get();
		}
		else
		{
			throw new ProductNotFound();
		}
	}

	@Override
	public String deleteProduct(Integer productId) {
		repository.deleteById(productId);
		return "Deleted successfully";
	}

	@Override
	public String updateProduct(Product product) throws ProductNotUpdated {
		Optional<Product> prod =repository.findById(product.getProductId());
		if(prod.isPresent())
		{
			Product p=repository.save(product);
			if(p!=null)
			{
				return "Updated successfully";
			}
			else
			{
				 return "ERROR while updation";
			}
		}
		else
		{
			throw new ProductNotUpdated();
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return repository.findAll();
	}

}

