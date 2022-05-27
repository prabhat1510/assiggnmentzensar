package com.example.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.test.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	List<Product> findById(String product_id);
	List<Product> findByProductName(String product_name);
	List<Product> findByDescription(String description);
}
