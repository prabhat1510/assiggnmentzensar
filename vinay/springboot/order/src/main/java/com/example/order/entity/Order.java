package com.example.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class Order {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer orderId;
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name="product_id")
	private Integer productId;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="order_amount")
	private Integer order_amount;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(Integer order_amount) {
		this.order_amount = order_amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", productId=" + productId + ", quantity="
				+ quantity + ", order_amount=" + order_amount + "]";
	}
	
	
}
