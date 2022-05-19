package com.training.olxmaster.service;

import java.util.List;

import com.training.olxmaster.entities.AdvStatus;
import com.training.olxmaster.exception.NoStatusFoundException;
import com.training.olxmaster.exception.StatusNotUpdatedException;

public interface AdvStatusService {
	
	public AdvStatus addStatus( AdvStatus  status);
	
	public  AdvStatus retriveStatus(Integer id) throws NoStatusFoundException;
	
	public String deleteStatus(Integer id);
	
	public String updateStatus(AdvStatus status) throws StatusNotUpdatedException;
	
	public List< AdvStatus> getAllStatus();

}
