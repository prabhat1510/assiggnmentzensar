package com.olx.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.demo.entities.Advertises;
import com.olx.demo.exception.NoAdvertisesFoundException;
import com.olx.demo.repository.AdvertisesRepository;

@Service
public class AdvertisesServiceImpl implements AdvertisesService {

	@Autowired
	AdvertisesRepository advertisesRepository;

	@Override
	public Advertises addAdvertise(Advertises advertises) {

		return advertisesRepository.save(advertises);
	}

	@Override
	public Advertises retrieveAdvertise(Integer id) throws NoAdvertisesFoundException {
		Optional<Advertises> advertises = advertisesRepository.findById(id);
		if (advertises.isPresent()) {
			return advertises.get();
		} else {
			throw new NoAdvertisesFoundException("Unable to get Advertises with id"+id);
		}

	}

	@Override
	public String deleteAdvertise(Integer id) throws NoAdvertisesFoundException {
		if(id != null) {
			advertisesRepository.deleteById(id);
			return "Advertises with id ---" + id + "  deleted successfully";
		}
		else {
			throw new NoAdvertisesFoundException("Unable to detele Advertises with id"+id);
		}
	}

	@Override
	public String updateAdvertises(Advertises advertises) throws NoAdvertisesFoundException {
		Optional<Advertises> ads = advertisesRepository.findById(advertises.getId());
		if (ads.isPresent()) {
			Advertises ad = advertisesRepository.save(advertises);
			if (ad != null) {
				return "Advertises entity updated successfully";
			} else {
				return "Advertises entity not updated successfully";
			}
		} else {
			throw new NoAdvertisesFoundException("Advertise with id ---" + advertises.getId() + "  cannot be update as it doesn't exists");
		}

	}

	@Override
	public List<Advertises> getAllAdvertises() {
		return (List<Advertises>) advertisesRepository.findAll();
	}

//	Search advertisements based upon given filter criteria
	@Override
	public List<Advertises> searchAdvertise(String query) throws NoAdvertisesFoundException {
		List<Advertises> uName = advertisesRepository.findByUsername(query);
		List<Advertises> title = advertisesRepository.findByTitle(query);
		
		System.out.println("uName: "+uName);
		System.out.println("title: "+title);

		try {
			List<Advertises> category = advertisesRepository.findByCategory(Integer.parseInt(query));
			List<Advertises> status = advertisesRepository.findByStatus(Integer.parseInt(query));
			List<Advertises> price = advertisesRepository.findByPrice(Double.parseDouble(query));

			System.out.println("category: "+category);
			System.out.println("status: "+status);
			System.out.println("price: "+price);

			if(!category.isEmpty()){

				return category;
			} else if(!status.isEmpty()){

				return status;
			} else if(!price.isEmpty()){

				return price;
			} else {

				throw new NoAdvertisesFoundException("Search result not found");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		if(!uName.isEmpty()) {
			return uName;

		} else if(!title.isEmpty()){

			return title;
		} else {

			throw new NoAdvertisesFoundException("Search result not found");
		}

	}

}