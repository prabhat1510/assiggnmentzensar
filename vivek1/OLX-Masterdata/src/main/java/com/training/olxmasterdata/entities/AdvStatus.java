package com.training.olxmasterdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADV_STATUS")
public class AdvStatus {

	@Id
	private int id;
	@Column(nullable = false, length = 50)
	private String status;

	public AdvStatus(int i, String string) {
		// TODO Auto-generated constructor stub
		id = i;
		status = string;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Advertisement_Status [ Id = " + getId() + ", Status = " + getStatus() + " ]";
	}

}
