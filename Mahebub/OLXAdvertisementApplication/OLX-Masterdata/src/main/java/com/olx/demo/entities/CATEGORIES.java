package com.olx.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CATEGORIES {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	@Column(name="name", nullable=false)
	private String category;
	@Column(name="description", nullable=false)
	private String description;
	public CATEGORIES() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CATEGORIES [id=" + id + ", category=" + category + ", description=" + description + "]";
	}

}
