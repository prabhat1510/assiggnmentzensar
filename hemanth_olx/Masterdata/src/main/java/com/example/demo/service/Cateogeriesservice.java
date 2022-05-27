package com.example.demo.service;

import java.util.List;

import com.example.demo.entites.Cateogeries;

public interface Cateogeriesservice {
	public List<Cateogeries> getallcateogeries();
	public Cateogeries addcateogery(Cateogeries cateogeries);
	public String deletecateogery(Integer id);
	public String updatecateogery(Cateogeries cateogery);
	public Cateogeries retrivecateogery(Integer id);

}
