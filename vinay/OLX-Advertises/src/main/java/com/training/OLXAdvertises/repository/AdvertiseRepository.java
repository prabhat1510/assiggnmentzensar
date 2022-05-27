package com.training.OLXAdvertises.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.training.OLXAdvertises.entites.Advertises;

@Repository
public interface AdvertiseRepository extends JpaRepository<Advertises, Integer> {
	
	@Query("SELECT a FROM Advertises a WHERE CONCAT(a.Category, a.posted_by, a.price) LIKE %?1%")
	public List<Advertises> search(String keyword);
	

}