package com.CustomerDetails.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetails {

		
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@OneToOne(cascade=CascadeType.ALL)
		@Column (name= "Customerid")
		private Integer id;
		@Column(name= "customername")
		private String name;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "CustomerDetails [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
		
		

}
