package com.training.olxadvertises.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.olxadvertises.entities.Advertises;

@Repository
public interface AdvertisesRepository extends JpaRepository<Advertises, Integer> {

	List<Advertises> findAdvertisesByTitle(String title);
}
