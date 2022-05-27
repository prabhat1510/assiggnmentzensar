package com.example.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_id;
	
	@Column(nullable = false, length = 60)
	private String customername;

	public Integer getId() {
		return customer_id;
	}

	public void setId(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomername() {
		return customername;
	}

	public void getCustomername(String customername) {
		this.customername = customername;
	}

	@Override
	public String toString() {
		return "Users [customer_id=" + customer_id + ", customername=" + customername + "]";
	}

}
