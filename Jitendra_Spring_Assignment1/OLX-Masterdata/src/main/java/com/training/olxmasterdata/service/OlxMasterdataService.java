package com.training.olxmasterdata.service;

import java.util.List;

import com.training.olxmasterdata.entities.AdvStatus;
import com.training.olxmasterdata.entities.Categories;

public interface OlxMasterdataService {

	public List<AdvStatus> getAllAdvStatus();
	public List<Categories> getAllCategories();
}
