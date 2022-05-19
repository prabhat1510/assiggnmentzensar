package com.olx.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.demo.entities.ADV_STATUS;
import com.olx.demo.repository.StatusRepository;

@Service
public class Adv_StatusServiceImpl implements Adv_StatusService {

	@Autowired
	StatusRepository statusRepository;

	@Override
	public ADV_STATUS addStatus(ADV_STATUS status) {

		return statusRepository.save(status);
	}

	@Override
	public List<ADV_STATUS> getAllStatus() {
		return (List<ADV_STATUS>) statusRepository.findAll();
	}

}