package com.training.olxmaster.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="CATEGORIES")
public class Categories {
	
	@Id
	@NonNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@NonNull
	@Column(name="name")
	private String Name;
	
	
	@NonNull
	@Column(name="description")
	private String Description;

	public Categories() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", Name=" + Name + ", Description=" + Description + "]";
	}
	
}
