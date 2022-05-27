package com.training.OLXAdvertises.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.OLXAdvertises.entites.Advertises;
import com.training.OLXAdvertises.service.AdvertiseService;

@RestController
	@RequestMapping("/api/v3/advertise")
	public class FilterAdvertise {

		@Autowired
		AdvertiseService service;

		@RequestMapping(value="/api/v2/advertise/findadvertise",
				method = RequestMethod.GET,
				produces = {MediaType.APPLICATION_XML_VALUE})
		public List<Advertises> listofAdvertises(){
			String keyword="32000";
			return service.listofAdvertises(keyword);
		}
}
