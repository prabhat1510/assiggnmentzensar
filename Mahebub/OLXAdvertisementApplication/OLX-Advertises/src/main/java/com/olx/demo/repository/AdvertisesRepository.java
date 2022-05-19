package com.olx.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.olx.demo.entities.Advertises;

public interface AdvertisesRepository extends CrudRepository<Advertises,Integer> {
	List<Advertises> findByTitle(String title);
	List<Advertises> findByUsername(String username);
	List<Advertises> findByPrice(Double price);
	List<Advertises> findByCategory(Integer category);
	List<Advertises> findByStatus(Integer status);
	List<Advertises> findByActive(Boolean active);
}
