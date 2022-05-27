package com.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="product")
	public class Product{
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer productId;

		public Integer getProductId() {
			return productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + "]";
		}

}
