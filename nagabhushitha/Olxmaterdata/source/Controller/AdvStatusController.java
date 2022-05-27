package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AdvStatus;
import com.example.demo.service.AdvStatusService;

@RestController
@RequestMapping(value = "/advertise")
public class AdvStatusController {
	
	@Autowired
	AdvStatusService statusService;
	
	@GetMapping(value = "/status")
	public List<AdvStatus> allStatus() {
		List<AdvStatus> status = statusService.allStatus();
		return status;
	}

}