package com.assessment.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
