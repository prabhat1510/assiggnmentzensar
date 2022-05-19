package com.training.olxadvertises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxadvertises.entities.Advertises;
import com.training.olxadvertises.service.OlxAdvertisesService;

// URI - http://localhost:9000
@RestController
public class OlxAdvertisesController {

	@Autowired
	OlxAdvertisesService advservice;

	// 7. To add new advertises
	@PostMapping("/advertise")
	public Advertises newAdvertise(@RequestBody Advertises advertise) {
		return advservice.newAdvertise(advertise);
	}

	// 8. To update existing advertise
	@PutMapping("/advertise/{id}")
	public Advertises updateAdvertise(@RequestBody Advertises ad, @PathVariable Integer id) {
		return advservice.updateAdvertise(ad, id);
	}

	// 9. To read all the advertise posted by logged in user
	@GetMapping("/user/advertise")
	public List<Advertises> getAllAdvertises() {
		return advservice.getAllAdvertises();
	}

	// 10. Reads specific advertisement posed by logged in user

	// 11. Deletes specific advertisement posted by logged in user
	@DeleteMapping("/user/advertise/{postId}")
	public boolean deleteAdvertiseById(@PathVariable("id") Integer id) {
		return advservice.deleteAdvertiseById(id);
	}

	// 12. Search advertisements based upon given filter criteria

	// 13. Matches advertisements using the provided 'searchText' within all fields
	// of an advertise.

	// 14. Get Advertise by id
	@RequestMapping("/advertise/{postId}")
	public Advertises getAdvertisesById(@PathVariable Integer id) {
		return advservice.getAdvertisesById(id);
	}
}
