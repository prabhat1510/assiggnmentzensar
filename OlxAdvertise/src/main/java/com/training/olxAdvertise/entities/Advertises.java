package com.training.olxAdvertise.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import net.bytebuddy.dynamic.TypeResolutionStrategy.Active;


@Entity
@Table(name ="ADVERTISES")
public class Advertises {

	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
		private String title;
		
		private int category;
		
		private int status;
		private double price;
		private String posted_by;
		 private String description;
		 private String username;
		    @Lob
		    @Column(name="photo")
		   
		    @Temporal(TemporalType.DATE)
		    Date created_date;
		    
		    @Temporal(TemporalType.DATE)
		    Date modified_date;
		
		    @Enumerated(EnumType.STRING)
		    @Column(length = 8)
		    private Active active;
		    
		    
		    

			public Advertises() {
				
				// TODO Auto-generated constructor stub
			}

			public Long getId() {
				return id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getTitle() {
				return title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public int getCategory() {
				return category;
			}

			public void setCategory(int category) {
				this.category = category;
			}

			public int getStatus() {
				return status;
			}

			public void setStatus(int status) {
				this.status = status;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			public String getPosted_by() {
				return posted_by;
			}

			public void setPosted_by(String posted_by) {
				this.posted_by = posted_by;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public Date getCreated_date() {
				return created_date;
			}

			public void setCreated_date(Date created_date) {
				this.created_date = created_date;
			}

			public Date getModified_date() {
				return modified_date;
			}

			public void setModified_date(Date modified_date) {
				this.modified_date = modified_date;
			}

			public Active getActive() {
				return active;
			}

			public void setActive(Active active) {
				this.active = active;
			}

			@Override
			public String toString() {
				return "Advertises [id=" + id + ", title=" + title + ", category=" + category + ", status=" + status
						+ ", price=" + price + ", posted_by=" + posted_by + ", description=" + description
						+ ", username=" + username + ", created_date=" + created_date + ", modified_date="
						+ modified_date + ", active=" + active + "]";
			}
		    
		    
		    
		
}
