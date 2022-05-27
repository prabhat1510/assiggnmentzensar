package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignment.demo.entities.AdvStatus;
import com.assignment.demo.service.AdvStatusService;

public class AllAdvStatusController {
	@Autowired
	AdvStatusService advstatusService;
		
	//Receiving data from client
	@RequestMapping(value="/api/v2/advstatus/alladvstatus", 
				method=RequestMethod.GET,
				//consumes= {MediaType.APPLICATION_XML_VALUE},
				produces={MediaType.APPLICATION_XML_VALUE})
		public List<AdvStatus> getAdvStatus(){
			return advstatusService.getAllAdvStatus();
		}

}
