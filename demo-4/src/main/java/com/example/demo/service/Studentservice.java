package com.example.demo.service;
import com.example.demo.entity.College;
import com.example.demo.exception.Nocollegefoundexception;
public interface Studentservice {
	public College addcollegedata(College college) throws Nocollegefoundexception;
	public String update(College college) throws Nocollegefoundexception;
	public College retreive(Integer id) throws Nocollegefoundexception;
	public String delete(Integer id) throws Nocollegefoundexception;
	
	
	

}
