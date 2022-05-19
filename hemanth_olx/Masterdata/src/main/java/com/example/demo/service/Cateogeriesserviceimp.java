package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Cateogeries;
import com.example.demo.repository.catrogeriesrepository;

@Service
public class Cateogeriesserviceimp implements Cateogeriesservice{
	@Autowired
	catrogeriesrepository caterepo;

	@Override
	public List<Cateogeries> getallcateogeries() {
		
		return (List<Cateogeries>) caterepo.findAll();
	}

	@Override
	public Cateogeries addcateogery(Cateogeries cateogeries) {
		
		return caterepo.save(cateogeries);
	}

	@Override
	public String deletecateogery(Integer id) {
		caterepo.deleteById(id);
		return "book with id"+id+"deleted";
	}

	@Override
	public String updatecateogery(Cateogeries cateogeries) {
		Optional<Cateogeries> cat =caterepo.findById(cateogeries.id);
		if (cat.isPresent()) {
			Cateogeries ca = caterepo.save(cateogeries);
			if (ca != null) {
				return "cateogery updated successfully";
			} else {
				return "cateogery not updated successfully";
			}
		} else {
			return "Book with bookId ---" + cateogeries.getId() + "  cannot be update as it doesn't exists";
	}
	}

	@Override
	public Cateogeries retrivecateogery(Integer id) {
		Optional<Cateogeries> cat =caterepo.findById(id);
		if (cat.isPresent()) {
			return cat.get(); 
		} else {
			return null;
		}
		
	}

}
