package com.training.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer studentId;
	private String studentName;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="collegeId")
	
	private College college;
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	}
}