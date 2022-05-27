package com.product.microservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.microservice.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
