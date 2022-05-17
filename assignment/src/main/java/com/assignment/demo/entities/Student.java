package com.assignment.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
//@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="collegeId")
	private College college;
	
	public Student() {
		super();
	}
	
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
		return getCollege();
	}
	public void setCollegeId(College college) {
		this.college = college;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", collegeId=" + college + "]";
	}
}
