package com.training.OLXAdvertises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.OLXAdvertises.entites.Advertises;
import com.training.OLXAdvertises.exception.AdvertisesNotUpdatedException;
import com.training.OLXAdvertises.exception.NoAdvertisesFoundException;
import com.training.OLXAdvertises.service.AdvertiseService;

@RestController
@RequestMapping(value = "/api/v1/advertise")
public class AdvertiseController {
	
	@Autowired
	AdvertiseService service;
	
	//url:http://localhost:9090/api/v1/advertise/addadvertise
	@PostMapping("/addadvertise")
	public Advertises addAdvertise(@RequestBody Advertises advertises) {
		return service.addAdvertise(advertises);
	}
	
	//url:http://localhost:9090/api/v1/advertise/{id}?id=1
	@GetMapping("/{id}")
	public  Advertises retriveAdvertises(Integer id) throws NoAdvertisesFoundException
	{
		return service.retriveAdvertises(id);
	}
	
	//url:http://localhost:9090/api/v1/advertise/deleteadvertise/{id}?id=2
	@DeleteMapping("/deleteadvertise/{id}")
	public String deleteAdvertises(Integer id)
	{
		return deleteAdvertises(id);
	}
	
	//url:http://localhost:9090/api/v1/advertise/updateadvertise
	@PutMapping("/updateadvertise")
	public String updateStatus(Advertises advertises) throws AdvertisesNotUpdatedException
	{
		return service.updateStatus(advertises);
	}

}