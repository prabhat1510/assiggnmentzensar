package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Cateogeries;
import com.example.demo.service.Cateogeriesserviceimp;

@RestController
@RequestMapping(value="/api/v4/cate")
public class Cateogeriescontroller {
	@Autowired
	Cateogeriesserviceimp cateserimp;
	
	
	@GetMapping("/categories")
	public List<Cateogeries> allCategories() {
		List<Cateogeries> categories = cateserimp.getallcateogeries();
		return categories;
	}


}