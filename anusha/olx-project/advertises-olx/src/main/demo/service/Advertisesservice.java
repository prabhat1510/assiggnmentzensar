package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entites.Advertises;
import com.example.demo.exception.Advertiseexception;

public interface Advertisesservice {
	public List<Advertises> getAllAdvertises() throws Advertiseexception;
	public Advertises addAdvertise(Advertises advertises) throws Advertiseexception;
	public String getAdvertise(Integer id) throws Advertiseexception;
	public String updateAdvertise(Integer id, Advertises advertises) throws Advertiseexception;
	public Optional<Advertises> getadvertisestatus(Advertises status) throws Advertiseexception;

}