package com.training.olxadvertises.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.olxadvertises.entities.Advertises;

@Service
public interface OlxAdvertisesService {

	// To add new advertises
	public Advertises newAdvertise(Advertises ad);

	// To update existing advertise
	public Advertises updateAdvertise(Advertises ad, Integer id);

	// To read all the advertise posted by logged in user
	public List<Advertises> getAllAdvertises();

	// Reads specific advertisement posed by logged in user

	// Deletes specific advertisement posted by logged in user
	public boolean deleteAdvertiseById(Integer id);

	// Search advertisements based upon given filter criteria
	// Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.
	public Advertises getAdvertiseByText(String text);

	// Get Advertise by id
	public Advertises getAdvertisesById(Integer id);
}
