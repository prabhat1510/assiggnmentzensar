package com.training.olx.service;

import java.util.List;


import com.training.olx.entities.OlxAdvertises;
import com.training.olx.exceptions.NoDataFoundException;

public interface OlxAdvertisesService {
	
	public List<OlxAdvertises> getAllAdvertises();
	public OlxAdvertises addAdvertise(OlxAdvertises advertises);
	public OlxAdvertises getAdvertise(Integer id) throws NoDataFoundException;
	public String updateAdvertise(Integer id, OlxAdvertises advertises) throws NoDataFoundException;
	public List<OlxAdvertises> searchAdvertise(String query) throws NoDataFoundException;
}


