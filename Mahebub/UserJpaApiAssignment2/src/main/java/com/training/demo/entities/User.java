package com.training.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class User {

		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		@Column(name="user_id")
		private Integer userId;
		@Column(name="user_name")
		private String name;
		@Column(name="user_city")
		private String city;
		
		//No-arg constructor
		public User() {
			
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "User [userId=" + userId + ", name=" + name + ", city=" + city + "]";
		}
}		