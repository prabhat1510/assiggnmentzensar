package com.assignment.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
//@Table(name=Categories)
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Integer id;
	private String name;
	private String description;

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Categories [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
