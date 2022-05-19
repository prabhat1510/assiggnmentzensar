package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Advertises;
import com.example.demo.exception.NoDataFoundException;
import com.example.demo.repository.AdvertiseRepository;

@Service
public class AdvertisesServiceImpl implements AdvertisesService {
	@Autowired
	AdvertiseRepository advertisesRepository;
	@Override
	public List<Advertises> getAllAdvertises() {
		return (List<Advertises>) Repository.findAll();
	}

	@Override
	public Advertises addAdvertise(Advertises advertises) {
		return Repository.save(advertises);
	}

	@Override
	public Advertises getAdvertise(Integer id) throws NoDataFoundException {
		Optional<Advertises> adv = Repository.findById(id);

		if(adv.isPresent()) {
			return adv.get();
		} else {
			throw new NoDataFoundException();
		}
	}

	@Override
	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException {

		if(Repository.findById(id).isPresent()) {
			Advertises adv = Repository.findById(id).get();
			advertises.setId(id);
			BeanUtils.copyProperties(advertises, adv);
			Repository.save(adv);
			return "Updated";
		} else {
			throw new NoDataFoundException();
		}

	}

	@Override
	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException {
		List<Advertises> uName = Repository.findByUsername(query);
		List<Advertises> title = Repository.findByTitle(query);
		
		System.out.println("uName: "+uName);
		System.out.println("title: "+title);

		try {
			List<Advertises> category = Repository.findByCategory(Integer.parseInt(query));
			List<Advertises> status = Repository.findByStatus(Integer.parseInt(query));
			List<Advertises> price = Repository.findByPrice(Double.parseDouble(query));

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

				throw new NoDataFoundException();
			}
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
		if(!uName.isEmpty()) {
			return uName;

		} else if(!title.isEmpty()){

			return title;
		} else {

			throw new NoDataFoundException();
		}

	}

}
	