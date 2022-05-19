package com.olx.demo.service;

import java.util.List;

import com.olx.demo.entities.ADV_STATUS;

public interface Adv_StatusService {
	// Create
	public ADV_STATUS addStatus(ADV_STATUS status);

	// get all ADV_STATUS
	public List<ADV_STATUS> getAllStatus();
}
