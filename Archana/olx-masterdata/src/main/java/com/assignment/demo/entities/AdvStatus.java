package com.assignment.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "ADV_STATUS")
public class AdvStatus {

	//@NonNull
	@Column(nullable = false)
	private Integer id;
	@NonNull
	@Column(length = 50)
	private String status;

	public AdvStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "AdvStatus [id=" + id + ", status=" + status + "]";
	}

}
