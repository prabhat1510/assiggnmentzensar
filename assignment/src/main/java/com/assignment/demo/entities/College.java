package com.assignment.demo.entities;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer collegeId;
	private String collegeName; 
	private String address;
	public College() {
		super();
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
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
