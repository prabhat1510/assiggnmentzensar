package com.example.demo.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.College;
import com.example.demo.exception.Nocollegefoundexception;
import com.example.demo.service.Studentserviceimp;

@RestController
@RequestMapping(value="/api/v1/college")
public class Collegecontroller {
	@Autowired
	Studentserviceimp studentserviceimp;
	
	//Create
		@PostMapping("/addcollege")
		public College addcollegedata(@RequestBody College college) throws Nocollegefoundexception {
			return studentserviceimp.addcollegedata(college);		
			}
		
		
		//Retrieve
		@GetMapping("/{collegeid}")
		public College retrieve(@PathVariable Integer collegeid) throws Nocollegefoundexception {
			
			return studentserviceimp.retreive(collegeid);
		}
		
		
		
		//Delete
		@DeleteMapping("/removecollege/{collegeid}")
		public String delete(@PathVariable Integer collegeid) throws Nocollegefoundexception {
			
			return studentserviceimp.delete(collegeid);
		}
		
		//Update
		@PutMapping("/updatecollege")
		public String update(@RequestBody College college) throws Nocollegefoundexception {
			return studentserviceimp.update(college);
		}

}
