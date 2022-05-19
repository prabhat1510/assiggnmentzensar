package com.assignment.demo.service;

import java.util.List;
import java.util.Optional;

import com.assignment.demo.entities.Advertises;
import com.assignment.demo.exceptions.NoDataFoundException;

public interface AdvertisesService {
	public List<Advertises> getAllAdvertises();

	public Advertises addAdvertise(Advertises advertises);

	public Advertises getAdvertise(Integer id) throws NoDataFoundException;

	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException;

	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException;
}
