package com.product.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="product_details")

public class Product {
		
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="productid")
	    private Integer Id;
		@Column(name="productname")
	    private String Name;
	    @Column(name="productdescription")
	    private String description;
		
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
		public String Description() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
}
		


