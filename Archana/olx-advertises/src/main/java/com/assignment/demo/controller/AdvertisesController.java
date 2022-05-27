package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entities.Advertises;
import com.assignment.demo.exceptions.NoDataFoundException;
import com.assignment.demo.service.AdvertisesService;

@RestController
@RequestMapping(value = "/api/v1/advertises")
public class AdvertisesController {

	@Autowired
	AdvertisesService advService;

	@PostMapping("/advertise")
	public Advertises addAdvertise(@RequestBody Advertises advertises) {
		return advService.addAdvertise(advertises);
	}

	@PutMapping("/advertise/{id}")
	public String updateAdvertise(@PathVariable Integer id, @RequestBody Advertises advertises)
			throws NoDataFoundException {
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
