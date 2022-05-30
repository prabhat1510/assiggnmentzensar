package com.olx.advertises.entities;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADVERTISES")
public class Advertises {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 50)
	private String title;

	@Column(nullable = false)
	private Integer category;

	@Column(nullable = false)
	private Integer status;

	@Column(precision = 10, scale = 2)
	private Double price;

	@Column(nullable = false, length = 100)
	private String description;

	@Column(length = 45)
	private String posted_by;

	private Blob photo;
	private Date created_date;
	private Date modified_date;
	private Active active;
	private String username;
	
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
	
	public Integer getCategory() {
		return category;
	}
	
	public void setCategory(Integer category) {
		this.category = category;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPosted_by() {
		return posted_by;
	}
	
	public void setPosted_by(String posted_by) {
		this.posted_by = posted_by;
	}
	
	public Blob getPhoto() {
		return photo;
	}
	
	public void setPhoto(Blob photo) {
		this.photo = photo;
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
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", category=" + category + ", status=" + status
				+ ", price=" + price + ", description=" + description + ", posted_by=" + posted_by + ", photo=" + photo
				+ ", created_date=" + created_date + ", modified_date=" + modified_date + ", active=" + active
				+ ", username=" + username + "]";
	}
	
}