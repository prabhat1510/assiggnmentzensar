package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college_details")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer collegeid;
	private String collegename;
	private String address;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(Integer collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [collegeid=" + collegeid + ", collegename=" + collegename + ", address=" + address + "]";
	}

}