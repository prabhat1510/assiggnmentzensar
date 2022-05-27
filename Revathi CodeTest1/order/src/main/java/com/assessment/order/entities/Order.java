package com.assessment.order.entities;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Entity;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int id;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "order_amount")
	private double amount;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prod_id")
	private int prod_id;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "cust_id")
	private int cust_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	@Override
	public String toString() {
		return "Order [ Id = " + getId() + ", Quantity = " + getQuantity() + ", Amount = " + getAmount()
				+ ", Prod_id = " + getProd_id() + ", Cust_id = " + getCust_id() + " ]";
	}
}
