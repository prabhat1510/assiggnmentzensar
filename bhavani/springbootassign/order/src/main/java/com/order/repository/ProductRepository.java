package com.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.order.entity.Product;



public interface ProductRepository extends CrudRepository<Product, Integer> {

}
