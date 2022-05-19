package com.olx.masterdata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olx.masterdata.entities.categories.Categorie;

@Repository
public interface categorieRepository extends CrudRepository<Categorie, Integer> {

}