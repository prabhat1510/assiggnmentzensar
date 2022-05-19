package com.olx.masterdata.Service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.masterdata.Repository.statusRepository;

import ch.qos.logback.core.status.Status;

@Service
public class advStatusServiceImpl implements advStatusService{

	@Autowired
		statusRepository repository;

		@Override
		public List<Status> allStatus() {
			return (List<Status>) repository.findAll();
		}

		
	}


