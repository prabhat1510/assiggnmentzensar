package com.training.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private Integer collegeId;
	private String collegeName;

	public College() {
		// TODO Auto-generated constructor stub
	}

	public Integer getcollegeId() {
		return collegeId;
	}

	public void setcollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + "]";
	}

}