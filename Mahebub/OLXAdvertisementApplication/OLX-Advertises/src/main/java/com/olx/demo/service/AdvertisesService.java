package com.olx.demo.service;

import java.util.List;

import com.olx.demo.entities.Advertises;
import com.olx.demo.exception.NoAdvertisesFoundException;

public interface AdvertisesService {
	// Create
	public Advertises addAdvertise(Advertises advertises);
	
	//Update
	public String updateAdvertises(Advertises advertises) throws NoAdvertisesFoundException;

	// Retrieve
	public Advertises retrieveAdvertise(Integer id) throws NoAdvertisesFoundException;
	
	//Delete
	public String deleteAdvertise(Integer id) throws NoAdvertisesFoundException;

	// get all Advertises
	public List<Advertises> getAllAdvertises();
	
	//Search Filter criteria
	public List<Advertises> searchAdvertise(String query) throws NoAdvertisesFoundException;
}
