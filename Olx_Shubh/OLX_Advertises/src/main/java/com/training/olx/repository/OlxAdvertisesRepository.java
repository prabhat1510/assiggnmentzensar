package com.training.olx.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olx.entities.Active;
import com.training.olx.entities.OlxAdvertises;

@Repository
public interface OlxAdvertisesRepository extends CrudRepository<OlxAdvertises, Integer> {
	
	List<OlxAdvertises> findByTitle(String title);
	List<OlxAdvertises> findByUsername(String username);
	List<OlxAdvertises> findByPrice(Double price);
	List<OlxAdvertises> findByCategory(Integer category);
	List<OlxAdvertises> findByStatus(Integer status);
	List<OlxAdvertises> findByActive(Active active);
	
}
