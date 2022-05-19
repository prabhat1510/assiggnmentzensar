package com.olx.demo.entities;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "ADVERTISES")
public class Advertises {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable=false)
	private Integer id;
	@Column(nullable=false)
	private String title;
	@Column(nullable=false)
	private String category;
	@Column(nullable=false)
	private String status;
	@Value("${stuff.value:#{null}}")
	private Double price;
	@Column(nullable=false)
	private String description;
	@Column
	private Blob photo;
	@Value("${stuff.value:#{null}}")
	private Date created_date;
	@Value("${stuff.value:#{null}}")
	private Date modified_date;
	@Value("${stuff.value:#{null}}")
	private Boolean active;
	@Value("${stuff.value:#{null}}")
	private String posted_by;
	@Value("${stuff.value:#{null}}")
	private String username;
	
	public Advertises() {
		
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", category=" + category + ", status=" + status
				+ ", price=" + price + ", description=" + description + ", photo=" + photo + ", created_date="
				+ created_date + ", modified_date=" + modified_date + ", active=" + active + ", posted_by=" + posted_by
				+ ", username=" + username + "]";
	}

}
