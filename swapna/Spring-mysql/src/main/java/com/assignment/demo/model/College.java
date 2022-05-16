package com.assignment.demo.model;

public class College {

	
	  private Integer id;

	  private String name;

	  private String Address;

	private Integer collegeId;

	private String collegeName;

	  public Integer getCollegeId() {
			return id;
		}
	  public void setCollegeId(Integer collegeId) {
			this.collegeId = collegeId;
		}
	  public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
	   public String getAddress() {
	    return Address;
	  }

	  public void setAddress(String Address) {
	    this.Address = Address;
	  }
	  public String toString() {
			return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + Address + "]";
		}
	}
