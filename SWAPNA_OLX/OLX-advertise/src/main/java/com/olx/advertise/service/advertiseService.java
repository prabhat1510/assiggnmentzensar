package com.olx.advertise.service;

import java.util.List;

import com.olx.advertise.entities.Advertises;

public interface advertiseService {
		
		public List<Advertises> getAllAdvertises();
		public Advertises addAdvertise(Advertises advertises);
		public Advertises getAdvertise(Integer id) throws NoDataFoundException;
		public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException;
		public List<Advertises> searchAdvertise(String query) throws NoDataFoundException;
	}

