package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Advertises;
import com.example.demo.exception.Advertiseexception;
import com.example.demo.repository.Advertiserepository;
@Service
public class Advertisesserviceimp implements Advertisesservice{
	@Autowired
	Advertiserepository advertisesrepository;

	@Override
	public List<Advertises> getAllAdvertises() {
	return (List<Advertises>) advertisesrepository.findAll();
	}



	@Override
	public Advertises addAdvertise(Advertises advertises){
	
	return advertisesrepository.save(advertises);
	}



	@Override
	public String getAdvertise(Integer id) throws Advertiseexception{
	Optional<Advertises> adv = advertisesrepository.findById(id);

	if(adv.isPresent()) {
	return  "advertise"+adv.get()+"added successfully";
	} else {
	throw new Advertiseexception("unable to add");
	}
	}



	@Override
	public String updateAdvertise(Integer id, Advertises advertises) throws Advertiseexception{

	if(advertisesrepository.findById(id).isPresent()) {
	Advertises adv = advertisesrepository.findById(id).get();
	advertises.setId(id);
	BeanUtils.copyProperties(advertises, adv);
	advertisesrepository.save(adv);
	return "Updated";
	} else {
	throw new Advertiseexception("unable to update");
	}

	}



	@Override
	public Optional<Advertises> getadvertisestatus(Advertises status) {
		return advertisesrepository.findById(status.getId());
	}



	}

