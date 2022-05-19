package com.training.olxadvertises.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.training.olxadvertises.entities.Advertises;

@Service
public interface OlxAdvertisesService {

	// 7. To add new advertises
	public Advertises newAdvertise(Advertises ad);

	// 8. To update existing advertise
	public Advertises updateAdvertise(Advertises ad, Integer id);

	// 9. To read all the advertise posted by logged in user
	public List<Advertises> getAllAdvertises();

	// 10. Reads specific advertisement posed by logged in user

	// 11. Deletes specific advertisement posted by logged in user
	public boolean deleteAdvertiseById(Integer id);
	
	// 12. Search advertisements based upon given filter criteria
	// 13. Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.
	public Advertises getAdvertiseByText(String text);
	
	// 14. Get Advertise by id
	public Advertises getAdvertisesById(Integer id);
}
