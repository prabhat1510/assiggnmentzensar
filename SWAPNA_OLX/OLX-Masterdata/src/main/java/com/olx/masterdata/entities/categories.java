package com.olx.masterdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class categories {

	@Entity
	@Table(name="CATEGORIES" )
	public class Categorie {

			@Id
			@GeneratedValue(strategy =GenerationType.IDENTITY)
			@Column(name="id")
			private Integer id;
			@Column(name="categorie_name")
			private String name;
			@Column(name="Description")
			private String Description;

			
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
				return Description;
			}


			public void setDescription(String description) {
				Description = description;
			}


			@Override
			public String toString() {
				return "Categorie [id=" + id + ", name=" + name + ", Description=" + Description + ", getId()="
						+ getId() + ", getName()=" + getName() + ", getDescription()=" + getDescription()
						+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
						+ super.toString() + "]";
			}


			


			
	}

	
	}		





