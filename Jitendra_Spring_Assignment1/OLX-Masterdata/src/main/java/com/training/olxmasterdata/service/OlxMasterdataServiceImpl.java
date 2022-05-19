package com.training.olxmasterdata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.olxmasterdata.entities.AdvStatus;
import com.training.olxmasterdata.entities.Categories;
import com.training.olxmasterdata.repository.AdvStatusRepository;
import com.training.olxmasterdata.repository.CategoriesRepository;

@Service
public class OlxMasterdataServiceImpl implements OlxMasterdataService {

	@Autowired
	AdvStatusRepository advstatusrepo;
	@Autowired
	CategoriesRepository categoryrepo;

	@Override
	public List<AdvStatus> getAllAdvStatus() {

		List<AdvStatus> advstatus = new ArrayList<>();

		advstatus.add(new AdvStatus(1, "OPEN"));
		advstatus.add(new AdvStatus(2, "CLOSED"));

		return advstatus;
	}

	@Override
	public List<Categories> getAllCategories() {

		List<Categories> category = new ArrayList<>();

		category.add(new Categories(1, "Furniture"));
		category.add(new Categories(2, "Cars"));
		category.add(new Categories(3, "Mobiles"));
		category.add(new Categories(4, "Real Estate"));
		category.add(new Categories(5, "Sports"));

		return category;

	}

}

