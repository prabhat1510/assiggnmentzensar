package com.example.demo.contorller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Advertises;
import com.example.demo.service.Advertisesserviceimp;

@RestController
@RequestMapping(value="/api/v2/advertise")
public class Advertisescontroller {
	@Autowired
	Advertisesserviceimp adver;
	
	@PostMapping("/addadvertise")
	public Advertises addAdvertise(Advertises advertises) {
	return adver.addAdvertise(advertises);
	}
	
	
	@GetMapping("/getadvertises")
	public List<Advertises> getAllAdvertises() {
		return (List<Advertises>) adver.getAllAdvertises();
		}
	
	
	@GetMapping("/getstatus")
	
	public Optional<Advertises> getadvertisestatus(Advertises status) {
		return  adver.getadvertisestatus(status);
	}
}