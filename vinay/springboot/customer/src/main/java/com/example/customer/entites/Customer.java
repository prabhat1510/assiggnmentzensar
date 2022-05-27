package com.example.customer.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")


public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer costomerId;
	@Column(name="customer_name")
	private String name;
	public Integer getCostomerId() {
		return costomerId;
	}
	public void setCostomerId(Integer costomerId) {
		this.costomerId = costomerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [costomerId=" + costomerId + ", name=" + name + "]";
	}
	
}
