package com.olx.advertises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olx.advertises.entities.Advertises;
import com.olx.advertises.exceptions.NoDataFoundException;
import com.olx.advertises.service.AdvertisesService;

@RestController
public class AdvertisesController {
	
	@Autowired
	AdvertisesService advService;
	
	@PostMapping("/advertise")
	public Advertises addAdvertise(@RequestBody Advertises advertises) {
		return advService.addAdvertise(advertises);
	}
	
	@PutMapping("/advertise/{id}")
	public String updateAdvertise(@PathVariable Integer id, @RequestBody Advertises advertises) throws NoDataFoundException {
		return advService.updateAdvertise(id, advertises);
	}
	
	@GetMapping("/advertise/{id}")
	public Advertises getAdvertise(@PathVariable Integer id) throws NoDataFoundException {
		return advService.getAdvertise(id);
	}
	
	@GetMapping("/advertise")
	public List<Advertises> getAllAdvertises() {
		List<Advertises> adv = advService.getAllAdvertises();
		
		return adv;
	}
	
	@GetMapping("/advertise/search/{query}")
	public List<Advertises> searchAdvertise(@PathVariable String query) throws NoDataFoundException {
		List<Advertises> adv = advService.searchAdvertise(query);
		return adv;
	}

}
