package com.training.olxadvertises.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxadvertises.entities.Advertises;
import com.training.olxadvertises.repository.AdvertisesRepository;

@Service
public class OlxAdvertisesServiceImpl implements OlxAdvertisesService {

	@Autowired
	AdvertisesRepository advrepo;

	// To add new advertises
	@Override
	public Advertises newAdvertise(Advertises ad) {

		Advertises adv = advrepo.save(ad);
		return adv;
	}

	// To update existing advertise
	@Override
	public Advertises updateAdvertise(Advertises ad, Integer id) {
		Optional<Advertises> advertise = advrepo.findById(id);
		if (advertise != null) {
			return advrepo.save(ad);
		}
		return null;

	}

	// To read all the advertise posted by logged in user
	@Override
	public List<Advertises> getAllAdvertises() {
		return advrepo.findAll();
	}

	// Deletes specific advertisement posted by logged in user
	@Override
	public boolean deleteAdvertiseById(Integer id) {

		advrepo.deleteById(id);
		if (advrepo.findById(id) != null) {
			return false;
		}
		return true;
	}

	// Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.
	@Override
	public Advertises getAdvertiseByText(String text) {
		Advertises advertise = ((OlxAdvertisesServiceImpl) advrepo).getAdvertiseByText(text);
		return advertise;
	}

	// Get Advertise by id
	@Override
	public Advertises getAdvertisesById(Integer id) {
		Optional<Advertises> advertise = advrepo.findById(id);
		if (advertise.isPresent()) {
			return advertise.get();
		} else {
			return null;
		}

	}

}
