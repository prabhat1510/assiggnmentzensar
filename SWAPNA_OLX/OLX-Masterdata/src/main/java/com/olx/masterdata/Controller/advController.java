package com.olx.masterdata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.masterdata.Service.advStatusService;
import com.olx.masterdata.entities.Status;



@RestController
@RequestMapping(value = "/advertise")
public class advController {
	
	@Autowired
	advStatusService statusService;
	
	@GetMapping(value = "/status")
	public List<Status> allStatus() {
		List<Status> status = statusService.allStatus();
		return status;
	}

}