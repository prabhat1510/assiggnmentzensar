package com.assignment.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.demo.entities.Active;
import com.assignment.demo.entities.Advertises;

@Repository
public interface AdvertisesRepository extends CrudRepository<Advertises, Integer> {
	List<Advertises> findByTitle(String title);

	List<Advertises> findByUsername(String username);

	List<Advertises> findByPrice(Double price);

	List<Advertises> findByCategory(Integer category);

	List<Advertises> findByStatus(Integer status);

	List<Advertises> findByActive(Active active);
}
