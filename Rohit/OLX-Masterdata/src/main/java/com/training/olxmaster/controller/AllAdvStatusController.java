package com.training.olxmaster.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxmaster.entities.AdvStatus;
import com.training.olxmaster.service.AdvStatusService;

@RestController
@RequestMapping(value = "/api/v3/status")
public class AllAdvStatusController {

	@Autowired
	AdvStatusService service;

	
	//http://localhost:9090//api/v3/status/allstatus
	@RequestMapping(value="/api/v3/status/allstatus",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<AdvStatus> getAdvStatus(){
		return service.getAllStatus();
	}

}
