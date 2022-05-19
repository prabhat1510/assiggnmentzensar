package com.training.olxmasterdata.service;

import java.util.List;
import java.util.Optional;

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

		return (List<AdvStatus>) advstatusrepo.findAll();
	}

	@Override
	public List<Categories> getAllCategories() {

		return (List<Categories>) categoryrepo.findAll();

	}

	@Override
	public void addAdvertiseStatus() {
		Optional<AdvStatus> check;
		AdvStatus adstatus1 = new AdvStatus(1, "OPEN");
		check = advstatusrepo.findById(adstatus1.getId());
		if (!check.isPresent()) {
			advstatusrepo.save(adstatus1);
		}
		AdvStatus adstatus2 = new AdvStatus(2, "CLOSED");
		check = advstatusrepo.findById(adstatus2.getId());
		if (!check.isPresent()) {
			advstatusrepo.save(adstatus2);
		}
	}

	@Override
	public void addCategories() {
		// TODO Auto-generated method stub
		Optional<Categories> check;
		Categories category1 = new Categories(1, "Furniture", "Best in market");
		check = categoryrepo.findById(category1.getId());
		if (!check.isPresent()) {
			categoryrepo.save(category1);
		}
		Categories category2 = new Categories(2, "Cars", "Best in market");
		check = categoryrepo.findById(category2.getId());
		if (!check.isPresent()) {
			categoryrepo.save(category2);
		}

		Categories category3 = new Categories(3, "Mobiles", "Best in market");
		check = categoryrepo.findById(category3.getId());
		if (!check.isPresent()) {
			categoryrepo.save(category3);
		}
		Categories category4 = new Categories(4, "Real Estate", "Best in market");
		check = categoryrepo.findById(category4.getId());
		if (!check.isPresent()) {
			categoryrepo.save(category4);
		}
		Categories category5 = new Categories(5, "Sports", "Best in market");
		check = categoryrepo.findById(category5.getId());
		if (!check.isPresent()) {
			categoryrepo.save(category5);
		}

	}

}
