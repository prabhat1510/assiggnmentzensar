package com.training.olxmasterdata.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;






@Entity
@Table(name="CATEGORIES")
public class Categories {
	

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;
	
	

	@Column(nullable = false,length = 50)
	private String Name;
	
	
	@NotNull
	@Column(nullable = false,length = 100)
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
