package com.training.olxadvertise.entities;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

@Entity
@Table(name="ADVERTISES")
public class Advertises {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	private Integer id;
	
	@Column(nullable=false)
	private String title;
	
	@Column(nullable=false)
	private Integer Category;
	
	@Column(nullable=false)
	private Integer status;
	
	private Double price;
	
	@Column(nullable=false)
	private String description;
	
	@Lob
	@Column (name = "image")
	private byte[] photo;
	
	@CreationTimestamp
	private Date created_date;
	
	@UpdateTimestamp
	private Date modified_date;
	
	private Boolean active;
	
	private String posted_by;
	
	private String userName;

	public Advertises() {
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCategory() {
		return Category;
	}

	public void setCategory(Integer category) {
		Category = category;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Advertises [id=" + id + ", title=" + title + ", Category=" + Category + ", status=" + status
				+ ", price=" + price + ", description=" + description + ", photo=" + Arrays.toString(photo)
				+ ", created_date=" + created_date + ", modified_date=" + modified_date + ", active=" + active
				+ ", posted_by=" + posted_by + ", userName=" + userName + "]";
	}
	
	
}
