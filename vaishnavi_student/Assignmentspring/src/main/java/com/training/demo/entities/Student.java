package com.training.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	private Integer studentId;
	private String name;
	@ManyToOne
	private College college;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Integer getstudentId() {
		return studentId;
	}

	public void setCompanyId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Company [studentId=" + studentId + ", name=" + name + ", college=" + college + "]";
	}

}