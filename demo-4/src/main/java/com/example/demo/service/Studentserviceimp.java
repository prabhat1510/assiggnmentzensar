package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.College;
import com.example.demo.exception.Nocollegefoundexception;
import com.example.demo.repository.Collegerepository;

@Service
public class Studentserviceimp implements Studentservice{
	@Autowired
	Collegerepository collegerepository;

	@Override
	public College addcollegedata(College college) throws Nocollegefoundexception {
		
		return collegerepository.save(college);
	}

	

	@Override
	public College retreive(Integer id) throws Nocollegefoundexception {
		Optional<College> coll = collegerepository.findById(id);
		if (coll.isPresent()) {
			return coll.get();
		} else {
			return null;
		}
	}

	@Override
	public String delete(Integer id) throws Nocollegefoundexception {
		collegerepository.deleteById(id);
		return "Book with bookId ---" + id + "  deleted successfully";
	}

	@Override
	public String update(College college) throws Nocollegefoundexception {
		Optional<College> coll = collegerepository.findById(college.getCollegeid());
		if (coll.isPresent()) {
			College cl = collegerepository.save(college);
			if (cl != null) {
				return "Book entity updated successfully";
			} else {
				return "Book entity not updated successfully";
			}
		} else {
			return "Book with bookId ---" + college.getCollegeid() + "  cannot be update as it doesn't exists";
		}
	}
}

