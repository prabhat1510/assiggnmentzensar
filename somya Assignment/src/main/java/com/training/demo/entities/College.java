package com.training.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "College")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "collegeId")
	private Integer collegeId; // (primary key)

	@Column(name = "collegeName")
	private String collegeName;

	@Column(name = "address")
	private String address;

	public College() {

	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [ College_Id = " + collegeId + ", College_Name = " + collegeName + ", Adress =" + address
				+ " ] ";
	}

}
