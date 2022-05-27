package com.training.olxmasterdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxmasterdata.entities.AdvStatus;
import com.training.olxmasterdata.entities.Categories;
import com.training.olxmasterdata.service.OlxMasterdataService;

// URI - http://localhost:9009/
@RestController
public class OlxMasterdataController {

	@Autowired
	OlxMasterdataService olxmasterdataservice;

	@RequestMapping(value = "/advertise/status", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<AdvStatus> getAdvStatus() {
		olxmasterdataservice.addAdvertiseStatus();
		return olxmasterdataservice.getAllAdvStatus();
	}

	@RequestMapping(value = "/advertise/category", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public List<Categories> getCategories() {
		olxmasterdataservice.addCategories();
		return olxmasterdataservice.getAllCategories();
	}
}
