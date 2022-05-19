package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.ADV_STATUS;
import com.example.demo.repository.ADV_STATUSrepository;

@Service
public class Adv_statusserviceimp implements Adv_statusservice{
@Autowired
ADV_STATUSrepository advstatusrepository;
	@Override
	public List<ADV_STATUS> allStatus() {
		return (List<ADV_STATUS>) advstatusrepository.findAll();
		
	}

}
