package com.assignment.demo.service;

import java.util.List;

import com.assignment.demo.entities.AdvStatus;
import com.assignment.demo.exceptions.NoStatusFoundException;
import com.assignment.demo.exceptions.StatusNotUpdatedException;

public interface AdvStatusService {
	// Create
	public AdvStatus addAdvStatus(AdvStatus advstatus);

	// Retrieve
	public AdvStatus retrieveAdvStatus(Integer id) throws NoStatusFoundException;

	// Delete
	public String deleteAdvStatus(Integer id);

	// Update
	public String updateAdvStatus(AdvStatus advstatus) throws StatusNotUpdatedException;

	// Retrieve all books
	public List<AdvStatus> getAllAdvStatus();

}
