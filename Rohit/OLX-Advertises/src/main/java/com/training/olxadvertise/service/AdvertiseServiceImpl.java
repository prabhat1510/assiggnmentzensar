package com.training.olxadvertise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxadvertise.entities.Advertises;
import com.training.olxadvertise.exception.AdvertisesNotUpdatedException;
import com.training.olxadvertise.exception.NoAdvertisesFoundException;
import com.training.olxadvertise.repository.AdvertiseRepository;

@Service
public class AdvertiseServiceImpl implements AdvertiseService{
	
	@Autowired
	AdvertiseRepository advertiseRepository;
	

	@Override
	public Advertises addAdvertise(Advertises advertises) {
		return advertiseRepository.save(advertises);
	}

	@Override
	public Advertises retriveAdvertises(Integer id) throws NoAdvertisesFoundException {
		Optional<Advertises> advert=advertiseRepository.findById(id);
		if(advert.isPresent())
		{
			return advert.get();
		}
		else
		{
			throw new NoAdvertisesFoundException();
		}
	}

	@Override
	public String deleteAdvertises(Integer id) {
		advertiseRepository.deleteById(id);
		return "Advertise with id "+id+"Delete successfully";
	}

	@Override
	public String updateStatus(Advertises advertises) throws AdvertisesNotUpdatedException {
		Optional<Advertises> advert1=advertiseRepository.findById(advertises.getId());
		if(advert1.isPresent())
		{
			Advertises a= advertiseRepository.save(advertises);
			if(a!=null)
			{
				return "Advertise updated sucsessfully";
				
			}
			else
			{
				return "ERROR! while updating Advertise";
			}
		}
		else
		{
			throw new AdvertisesNotUpdatedException();
		}
	}

	@Override
	public List<Advertises> getAllAdvertises() {
		
		return (List<Advertises>) advertiseRepository.findAll();
	}

	@Override
	public List<Advertises> listofAdvertises(String keyword) {
		
		return advertiseRepository.search(keyword);
	}
}
