package com.example.product.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ProductDetail")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long productid;
	
	
	@Column(nullable = false, length = 50)
	private String productname;
	
	@Column(nullable = false, length = 100)
	private String description;
	
	
	
	
	
	
	

	public Product() {
		
		// TODO Auto-generated constructor stub
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProductDetail [productid=" + productid + ", productname=" + productname + ", description=" + description
				+ "]";
	}

	
	
	
	
}
