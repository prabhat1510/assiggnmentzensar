package com.Order.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "ORDERS_MASTER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customer_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer product_id;
	
	@Column(nullable = false, length = 100)
	private Integer quntity;
	
	@Column(nullable = false, length = 100)
	private Integer order_amount;

	public Integer getId() {
		return order_id;
	}

	public void setId(Integer order_id) {
		this.order_id = order_id;
	}
	
	public Integer getProductId() {
		return product_id;
	}

	public void setProductId(Integer product_id) {
		this.product_id = product_id;
	}
	
	public Integer getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getQuntity() {
		return quntity;
	}

	public void setQuntity(Integer quntity) {
		this.quntity = quntity;
	}
	
	public Integer getOrderAmount() {
		return order_amount;
	}

	public void setOrderAmount(Integer order_amount) {
		this.order_amount = order_amount;
	}

	@Override
	public String toString() {
		return "Categories [order_id=" + order_id + ", quntity=" + quntity + ", order_amount=" + order_amount + "]";
	}
	
}
