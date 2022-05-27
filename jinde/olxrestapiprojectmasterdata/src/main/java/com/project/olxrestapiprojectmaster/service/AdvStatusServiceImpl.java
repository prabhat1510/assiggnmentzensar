package com.project.olxrestapiprojectmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.olxrestapiprojectmaster.repository.AdvStatusRepository;

import olxrestapiprojectmasterdata.entities.AdvStatus;

@Service
public class AdvStatusServiceImpl implements AdvStatusService {
	@Autowired
	AdvStatusRepository repository;

	@Override
	public List<AdvStatus> allStatus() {
		return (List<AdvStatus>) repository.findAll();
	}

}


