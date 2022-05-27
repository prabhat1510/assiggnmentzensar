package com.olx.advertise.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	
	@Table(name="ADVERTISE_DETAILS" )
	public class Advertises {

			@Id
			@GeneratedValue(strategy =GenerationType.IDENTITY)
			@Column(name="id")
			private Integer id;
			@Column(name="title")
			private String title;
			@Column(name="status")
			private String status;
			@Column(name="categorie")
			private String categorie;
			@Column(name="price")
			private Double price;
			@Column(name="Description")
			private String Description;
			@Column(name="photo_blob")
			private Integer  photo_blob;
			@Column(name="createdate")
			private Date create_date;
			@Column(name="modified_date")
			private Date modified_date;
			@Column(name="posted_by")
			private String posted_by;
			@Column(name="username")
			private String username;
			@Column(name="active_enum")
			private boolean active_enum;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public String getCategorie() {
				return categorie;
			}
			public void setCategorie(String categorie) {
				this.categorie = categorie;
			}
			public Double getPrice() {
				return price;
			}
			public void setPrice(Double price) {
				this.price = price;
			}
			public String getDescription() {
				return Description;
			}
			public void setDescription(String description) {
				Description = description;
			}
			public Integer getPhoto_blob() {
				return photo_blob;
			}
			public void setPhoto_blob(Integer photo_blob) {
				this.photo_blob = photo_blob;
			}
			public Date getCreate_date() {
				return create_date;
			}
			public void setCreate_date(Date create_date) {
				this.create_date = create_date;
			}
			public Date getModified_date() {
				return modified_date;
			}
			public void setModified_date(Date modified_date) {
				this.modified_date = modified_date;
			}
			public String getPosted_by() {
				return posted_by;
			}
			public void setPosted_by(String posted_by) {
				this.posted_by = posted_by;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public boolean isActive_enum() {
				return active_enum;
			}
			public void setActive_enum(boolean active_enum) {
				this.active_enum = active_enum;
			}
			@Override
			public String toString() {
				return "Advertises [id=" + id + ", title=" + title + ", status=" + status + ", categorie=" + categorie
						+ ", price=" + price + ", Description=" + Description + ", photo_blob=" + photo_blob
						+ ", create_date=" + create_date + ", modified_date=" + modified_date + ", posted_by="
						+ posted_by + ", username=" + username + ", active_enum=" + active_enum + ", getId()=" + getId()
						+ ", getTitle()=" + getTitle() + ", getStatus()=" + getStatus() + ", getCategorie()="
						+ getCategorie() + ", getPrice()=" + getPrice() + ", getDescription()=" + getDescription()
						+ ", getPhoto_blob()=" + getPhoto_blob() + ", getCreate_date()=" + getCreate_date()
						+ ", getModified_date()=" + getModified_date() + ", getPosted_by()=" + getPosted_by()
						+ ", getUsername()=" + getUsername() + ", isActive_enum()=" + isActive_enum() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			
			
			
			
			
			
			
}
			

			

			