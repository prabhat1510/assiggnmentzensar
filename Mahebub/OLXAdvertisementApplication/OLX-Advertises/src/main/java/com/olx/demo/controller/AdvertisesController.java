package com.olx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olx.demo.entities.Advertises;
import com.olx.demo.exception.NoAdvertisesFoundException;
import com.olx.demo.service.AdvertisesService;

@RestController
@RequestMapping(value = "/advertise/category")
public class AdvertisesController {

	@Autowired
	AdvertisesService advertisesService;

	// Posts new advertise
	@PostMapping("/advertise")
	public Advertises addAdvertises(@RequestBody Advertises advertises) {
		return advertisesService.addAdvertise(advertises);
	}

	// Updates existing advertise
	@PutMapping("/advertise/{id}")
	public String updateUser(@RequestBody Advertises advertises) throws NoAdvertisesFoundException {
		return advertisesService.updateAdvertises(advertises);
	}

	// Reads all advertisements posted by logged in user
	@RequestMapping(value = "/user/advertise", method = RequestMethod.GET,
			// consumes = {MediaType.APPLICATION_XML_VALUE},
			produces = { MediaType.APPLICATION_XML_VALUE })
	public List<Advertises> getAdvertises() {
		return advertisesService.getAllAdvertises();
	}

	// Reads specific advertisement posed by logged in user
	@GetMapping("/user/advertise/{id}")
	public Advertises retrieveAdvertises(@PathVariable Integer id) throws NoAdvertisesFoundException {

		return advertisesService.retrieveAdvertise(id);
	}

	// Deletes specific advertisement posted by logged in user
	@DeleteMapping("/user/advertise/{id}")
	public String deleteAdvertise(@PathVariable Integer id) throws NoAdvertisesFoundException {

		return advertisesService.deleteAdvertise(id);
	}

	// Search advertisements based upon given filter criteria
	@GetMapping("/advertise/search/{query}")
	public List<Advertises> searchAdvertise(@PathVariable String query) throws NoAdvertisesFoundException {
		List<Advertises> adv = advertisesService.searchAdvertise(query);
		return adv;
	}
}