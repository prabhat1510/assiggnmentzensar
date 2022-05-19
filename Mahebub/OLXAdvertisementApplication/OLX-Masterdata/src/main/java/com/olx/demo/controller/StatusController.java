package com.olx.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olx.demo.entities.ADV_STATUS;
import com.olx.demo.service.Adv_StatusService;

@RestController
@RequestMapping(value="/advertise")
public class StatusController {

	@Autowired
	Adv_StatusService statusService;
	
	//Create
	@PostMapping("/addstatus")
	public ADV_STATUS addStatus(@RequestBody ADV_STATUS status) {
		return statusService.addStatus(status);
	}
	
	// Returns all possible advertise status
	@RequestMapping(value="/status",
			method = RequestMethod.GET,
			//consumes = {MediaType.APPLICATION_XML_VALUE},
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<ADV_STATUS> getStatus() {
		return statusService.getAllStatus();
	}
}