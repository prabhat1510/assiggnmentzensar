package com.assessment.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assessment.product.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
