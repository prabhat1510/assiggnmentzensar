package com.assessment.order.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Master")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderid;
	private Integer customerid;
	private Integer productid;
	private String quantity;
	private double order_amount;
	
	public Order() {
	
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(double order_amount) {
		this.order_amount = order_amount;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", customerid=" + customerid + ", productid=" + productid + ", quantity="
				+ quantity + ", order_amount=" + order_amount + "]";
	}

}
