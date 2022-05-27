package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Advertises;
import com.example.demo.exception.NoDataFoundException;

public interface AdvertisesService {
	public List<Advertises> getAllAdvertises();
	public Advertises addAdvertise(Advertises advertises);
	public Advertises getAdvertise(Integer id) throws NoDataFoundException;
	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException;
	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException;	
}
