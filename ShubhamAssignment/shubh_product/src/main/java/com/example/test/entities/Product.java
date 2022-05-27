package com.example.test.entities;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.example.test.entities.Active;

@Entity
@Table(name = "PRODUCTS")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer product_id;

	@Column(nullable = false, length = 100)
	private String product_name;
	
	@Column(nullable = false, length = 100)
	private String description;

	
	public Integer getId() {
		return product_id;
	}
	
	public void setId(Integer product_id) {
		this.product_id = product_id;
	}
	
	public String getProductName() {
		return product_name;
	}
	
	public void getProductName(String product_name) {
		this.product_name = product_name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void getDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", description=" + description + "]";
	}
}
