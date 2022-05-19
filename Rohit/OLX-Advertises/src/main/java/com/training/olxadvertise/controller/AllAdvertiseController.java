package com.training.olxadvertise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxadvertise.entities.Advertises;
import com.training.olxadvertise.service.AdvertiseService;

@RestController
@RequestMapping("/api/v2/advertise")
public class AllAdvertiseController {
	@Autowired
	AdvertiseService service;
	

	//http://localhost:9090//api/v2/status/allstatus
	@RequestMapping(value="/api/v2/advertise/alladvertise",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<Advertises> getAllAdvertises(){
		return service.getAllAdvertises();
	}
}
