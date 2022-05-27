package com.example.product.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.product.entites.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>  {

}
