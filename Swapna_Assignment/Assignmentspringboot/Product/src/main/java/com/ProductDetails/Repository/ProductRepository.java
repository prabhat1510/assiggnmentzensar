package com.ProductDetails.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ProductDetails.Entities.ProductDetails;

public interface ProductRepository extends CrudRepository<ProductDetails, Integer> {

}


