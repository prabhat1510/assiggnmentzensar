package com.training.olxmasterdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CATEGORIES")
public class Categories {

	@Id
	private int id;
	@Column(nullable = false, length = 50)
	private String name;
	@JsonIgnore
	@Column(nullable = false, length = 100)
	private String description;

	Categories() {
	}

	public Categories(int i, String name, String desc) {
		// TODO Auto-generated constructor stub
		id = i;
		this.name = name;
		description = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Categories [ Id = " + getId() + ", Name = " + getName() + ", Description = " + getDescription() + " ]";
	}

}
