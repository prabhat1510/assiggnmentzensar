package com.ProductDetails.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="product")

	public class ProductDetails {

		@Id
		private Long pid;
		
		@Column
		private String pname;
		
		@Column
		private String detail;
		
		private int  quntity;
		
		@Column
		private Double price;

		public Long getPid() {
			return pid;
		}

		public void setPid(Long pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public int getQuntity() {
			return quntity;
		}

		public void setQuntity(int quntity) {
			this.quntity = quntity;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "ProductDetails [pid=" + pid + ", pname=" + pname + ", detail=" + detail + ", quntity=" + quntity
					+ ", price=" + price + ", getPid()=" + getPid() + ", getPname()=" + getPname() + ", getDetail()="
					+ getDetail() + ", getQuntity()=" + getQuntity() + ", getPrice()=" + getPrice() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		


	}




