package com.training.olxmasterdata.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.training.olxmasterdata.entities.AdvStatus;

@Entity
@Table(name ="CATEGORIES")
public class Category {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String name;
	 private String description;
	 
	 @OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="advstatus_id")
		private AdvStatus advstatus;
	 
	 
	 
	 
	public Category() {
		
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
	
	

	public AdvStatus getAdvstatus() {
		return advstatus;
	}

	public void setAdvstatus(AdvStatus advstatus) {
		this.advstatus = advstatus;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", advstatus=" + advstatus
				+ "]";
	}

	public String getCategoryById() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	}
	 
	 
	 
	 

	
	
	
	
