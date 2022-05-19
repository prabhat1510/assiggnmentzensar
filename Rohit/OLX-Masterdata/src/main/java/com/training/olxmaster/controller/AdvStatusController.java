package com.training.olxmaster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.olxmaster.entities.AdvStatus;
import com.training.olxmaster.exception.NoStatusFoundException;
import com.training.olxmaster.exception.StatusNotUpdatedException;
import com.training.olxmaster.service.AdvStatusService;

@RestController
@RequestMapping(value = "/api/v1/status")
public class AdvStatusController {

	@Autowired
	AdvStatusService statusService;


	
	//url:http://localhost:9090/api/v1/status/addstatus
	@PostMapping("/addstatus")
	public AdvStatus addStatus(@RequestBody AdvStatus  status) 
	{
		return statusService.addStatus(status);
	}
	
	//url:http://localhost:9090/api/v1/status/2
	@GetMapping("/{id}")
	public  AdvStatus retriveStatus(Integer id) throws NoStatusFoundException
	{
		return statusService.retriveStatus(id);
	}
	
	//url:http://localhost:9090/api/v1/status/deletestatus/2
	@DeleteMapping("/deletestatus/{id}")
	public String deleteStatus(Integer id)
	{
		return statusService.deleteStatus(id);
	}
	
	//url:http://localhost:9090/api/v1/status/updatestatus
	@PutMapping("/updatestatus")
	public String updateStatus(AdvStatus status) throws StatusNotUpdatedException
	{
		return statusService.updateStatus(status);
	}



}
