package com.training.olx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.olx.entities.OlxAdvertises;
import com.training.olx.exceptions.NoDataFoundException;
import com.training.olx.service.OlxAdvertisesService;

public class OlxAdvertisesController {
	@Autowired
	OlxAdvertisesService advService;
	
	@PostMapping("/advertise")
	public OlxAdvertises addAdvertise(@RequestBody OlxAdvertises advertises) {
		return advService.addAdvertise(advertises);
	}
	
	@PutMapping("/advertise/{id}")
	public String updateAdvertise(@PathVariable Integer id, @RequestBody OlxAdvertises advertises) throws NoDataFoundException {
		return advService.updateAdvertise(id, advertises);
	}
	
	@GetMapping("/advertise/{id}")
	public OlxAdvertises getAdvertise(@PathVariable Integer id) throws NoDataFoundException {
		return advService.getAdvertise(id);
	}
	
	@GetMapping("/advertise")
	public List<OlxAdvertises> getAllAdvertises() {
		List<OlxAdvertises> adv = advService.getAllAdvertises();
		
		return adv;
	}
	
	@GetMapping("/advertise/search/{query}")
	public List<OlxAdvertises> searchAdvertise(@PathVariable String query) throws NoDataFoundException {
		List<OlxAdvertises> adv = advService.searchAdvertise(query);
		return adv;
	}


}
