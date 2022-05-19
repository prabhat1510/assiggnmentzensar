package com.olx.masterdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.masterdata.entities.AdvStatus;
import com.olx.masterdata.repository.AdvStatusRepository;

@Service
public class AdvStatusServiceImpl implements AdvStatusService {
	
	@Autowired
	AdvStatusRepository repository;

	@Override
	public List<AdvStatus> allStatus() {
		return (List<AdvStatus>) repository.findAll();
	}

}