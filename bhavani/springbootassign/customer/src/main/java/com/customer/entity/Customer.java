package com.customer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")

public class Customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="customerid")
    private Integer Id;
	@Column(name="customername")
    private String Name;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + "]";
	}
}