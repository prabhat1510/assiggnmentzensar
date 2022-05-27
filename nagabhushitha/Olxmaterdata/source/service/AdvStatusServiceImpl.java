package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.AdvStatus;
import com.example.demo.repository.AdvStatusRepository;
import com.example.*;

@Service
public class AdvStatusServiceImpl implements AdvStatusService {
	
	@Autowired
	AdvStatusRepository repository;

	@Override
	public List<AdvStatus> allStatus() {
		return (List<AdvStatus>) repository.findAll();
	}
}