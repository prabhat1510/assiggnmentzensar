package com.training.olxmasterdata.controller;



	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.MediaType;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.training.olxmasterdata.entites.AdvStatus;
import com.training.olxmasterdata.service.AdvStatusService;


@RestController
@RequestMapping(value = "/api/v3/status")
public class AllAdvStatusController {

	@Autowired
	AdvStatusService service;

	
	//http://localhost:9001//api/v3/status/allstatus
	@RequestMapping(value="/api/v3/status/allstatus",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE})
	public List<AdvStatus> getAdvStatus(){
		return service.getAllStatus();
	}

}