package com.training.olxmasterdata.service;

import java.util.List;

import com.training.olxmasterdata.entites.AdvStatus;
import com.training.olxmasterdata.exceptions.NoStatusFoundException;
import com.training.olxmasterdata.exceptions.StatusNotUpdatedException;

public interface AdvStatusService {
	
	public AdvStatus addStatus( AdvStatus  status);
	
	public  AdvStatus retriveStatus(Integer id) throws NoStatusFoundException;
	
	public String deleteStatus(Integer id);
	
	public String updateStatus(AdvStatus status) throws StatusNotUpdatedException;
	
	public List< AdvStatus> getAllStatus();

}