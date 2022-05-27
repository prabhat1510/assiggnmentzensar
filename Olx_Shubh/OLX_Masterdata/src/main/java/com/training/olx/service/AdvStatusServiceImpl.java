package com.training.olx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olx.entities.AdvStatus;
import com.training.olx.repository.AdvStatusRepository;

public class AdvStatusServiceImpl implements AdvStatusService {

	@Autowired
	AdvStatusRepository repository;

	@Override
	public List<AdvStatus> allStatus() {
		return (List<AdvStatus>) repository.findAll();
	}
}
