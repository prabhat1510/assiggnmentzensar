package com.training.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer studentid;
	private String studentName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="studentid")
	private College college;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getStudentId() {
		return studentid;
	}

	public void setStudentId(Integer studentId) {
		this.studentid = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName =studentName ;
	}

	public College getCollege() {
		return college;
	}

	public void setCollegeId(College collegeid) {
		this.college = college;
	}

	

	@Override
	public String toString() {
		return "Student [StudentId=" + studentid + ", StudentName=" + studentName 
				+ ",College=" + college + "]";
	}

}
