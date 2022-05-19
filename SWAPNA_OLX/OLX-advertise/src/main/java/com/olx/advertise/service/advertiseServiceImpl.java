package com.olx.advertise.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.advertise.entities.Advertises;
import com.olx.advertise.repository.advertiseRepository;

@Service
public class advertiseServiceImpl implements advertiseService {

	@Autowired
	advertiseRepository repository;

	@Override
	public List<Advertises> getAllAdvertises() {
		return (List<Advertises>) repository.findAll();
	}

	@Override
	public Advertises addAdvertise(Advertises advertises) {
		return repository.save(advertises);
	}

	@Override
	public Advertises getAdvertise(Integer id) throws NoDataFoundException {
		Optional<Advertises> adv = repository.findById(id);

		if(adv.isPresent()) {
			return adv.get();
		} else {
			throw new NoDataFoundException();
		}
	}

	@Override
	public String updateAdvertise(Integer id, Advertises advertises) throws NoDataFoundException {

		if(repository.findById(id).isPresent()) {
			Advertises adv = repository.findById(id).get();
			advertises.setId(id);
			BeanUtils.copyProperties(advertises, adv);
			repository.save(adv);
			return "Updated";
		} else {
			throw new NoDataFoundException();
		}

	}

	@Override
	public List<Advertises> searchAdvertise(String query) throws NoDataFoundException {
		List<Advertises> uName = repository.findByUsername(query);
		List<Advertises> title = repository.findByTitle(query);
		
		System.out.println("uName: "+uName);
		System.out.println("title: "+title);

		try {
			List<Advertises> category = repository.findByCategory(Integer.parseInt(query));
			List<Advertises> status = repository.findByStatus(Integer.parseInt(query));
			List<Advertises> price = repository.findByPrice(Double.parseDouble(query));

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