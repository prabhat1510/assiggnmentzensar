package com.olx.advertises.service;

import java.util.List;


import com.olx.advertises.entities.Advertises;
import com.olx.advertises.exceptions.NoDataFoundException;


public interface AdvertisesService {
	
	public List<Advertises> getAllAdvertises();
	public Advertises addAdvertise(Advertises advertises);
	public Advertises getAdvertise(Integer id) throws NoDataFoundException;
	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException;
	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException;
}
