package com.training.OLXAdvertises.service;

import java.util.List;

import com.training.OLXAdvertises.entites.Advertises;
import com.training.OLXAdvertises.exception.AdvertisesNotUpdatedException;
import com.training.OLXAdvertises.exception.NoAdvertisesFoundException;



public interface AdvertiseService {
	public Advertises addAdvertise(Advertises advertises);
	
	
	public  Advertises retriveAdvertises(Integer id) throws NoAdvertisesFoundException;
	
	public String deleteAdvertises(Integer id);
	
	public String updateStatus(Advertises advertises) throws AdvertisesNotUpdatedException;
	
	public List< Advertises> getAllAdvertises();
	
	public List<Advertises> listofAdvertises( String keyword);
}