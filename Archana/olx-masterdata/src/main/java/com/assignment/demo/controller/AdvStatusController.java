package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.entities.AdvStatus;
import com.assignment.demo.exceptions.NoStatusFoundException;
import com.assignment.demo.exceptions.StatusNotUpdatedException;
import com.assignment.demo.service.AdvStatusService;

@RestController
@RequestMapping(value = "/api/v1/advstatus")
public class AdvStatusController {
	@Autowired
	AdvStatusService advstatusService;

	// Create
	@PostMapping("/addadvstatus")
	public AdvStatus addAdvStatus(@RequestBody AdvStatus advstatus) {
		return advstatusService.addAdvStatus(advstatus);
	}

	// Retrieve
	@GetMapping("/{id}")
	public AdvStatus retrieveAdvStatus(@PathVariable Integer id) throws NoStatusFoundException {

		return advstatusService.retrieveAdvStatus(id);
	}

	// Delete
	@DeleteMapping("/removeadvstatus/{id}")
	public String deleteAdvStatus(@PathVariable Integer id) {

		return advstatusService.deleteAdvStatus(id);
	}

	// Update
	@PutMapping("/updateadvstatus")
	public String updateAdvStatus(@RequestBody AdvStatus advstatus) throws StatusNotUpdatedException {
		return advstatusService.updateAdvStatus(advstatus);
	}
	@GetMapping(value = "/status")
	public List<AdvStatus> getAllAdvStatus() {
		List<AdvStatus> status = advstatusService.getAllAdvStatus();
		return status;
	}

}
