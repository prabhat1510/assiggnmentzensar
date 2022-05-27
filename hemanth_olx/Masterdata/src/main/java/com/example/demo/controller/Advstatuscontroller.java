package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.ADV_STATUS;
import com.example.demo.service.Adv_statusserviceimp;

@RestController
@RequestMapping(value="/api/v3/advstatus")
public class Advstatuscontroller {
	@Autowired
	Adv_statusserviceimp advserviceimp;
	
	
	@GetMapping(value = "/status")
	public List<ADV_STATUS> allStatus() {
		List<ADV_STATUS> status = advserviceimp.allStatus();
		return status;
	}


}
