package com.training.olx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.olx.entities.OlxAdvertises;
import com.training.olx.exceptions.NoDataFoundException;
import com.training.olx.repository.OlxAdvertisesRepository;

@Service
public class OlxAdvertisesServiceImpl implements OlxAdvertisesService {

	@Autowired
	OlxAdvertisesRepository repository;

	@Override
	public List<OlxAdvertises> getAllAdvertises() {
		return (List<OlxAdvertises>) repository.findAll();
	}

	@Override
	public OlxAdvertises addAdvertise(OlxAdvertises advertises) {
		return repository.save(advertises);
	}

	@Override
	public OlxAdvertises getAdvertise(Integer id) throws NoDataFoundException {
		Optional<OlxAdvertises> adv = repository.findById(id);

		if(adv.isPresent()) {
			return adv.get();
		} else {
			throw new NoDataFoundException();
		}
	}

	@Override
	public String updateAdvertise(Integer id, OlxAdvertises advertises) throws NoDataFoundException {

		if(repository.findById(id).isPresent()) {
			OlxAdvertises adv = repository.findById(id).get();
			advertises.setId(id);
			BeanUtils.copyProperties(advertises, adv);
			repository.save(adv);
			return "Updated";
		} else {
			throw new NoDataFoundException();
		}

	}

	@Override
	public List<OlxAdvertises> searchAdvertise(String query) throws NoDataFoundException {
		List<OlxAdvertises> uName = repository.findByUsername(query);
		List<OlxAdvertises> title = repository.findByTitle(query);
		
		System.out.println("uName: "+uName);
		System.out.println("title: "+title);

		try {
			List<OlxAdvertises> category = repository.findByCategory(Integer.parseInt(query));
			List<OlxAdvertises> status = repository.findByStatus(Integer.parseInt(query));
			List<OlxAdvertises> price = repository.findByPrice(Double.parseDouble(query));

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
