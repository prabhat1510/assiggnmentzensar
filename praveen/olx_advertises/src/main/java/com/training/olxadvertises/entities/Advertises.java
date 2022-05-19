package com.training.olxadvertises.entities;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

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
	private Integer id; // int
	@Column(length = 50)
	private String title; // varchar(50)
	@Column(nullable = false)
	private int category; // int not null
	@Column(nullable = false)
	private int status; // int not null
	@Column(length = 10, precision = 2)
	private double price; // double(10,2)
	@Column(length = 100)
	private String description; // varchar(100) not null
	private boolean active; // boolean(0,1)
	@Column(length = 45)
	private String posted_by; // varchar(45)
	@Column(length = 255)
	private String username; // varchar(255)

	// For storing photo in byte array
	private byte[] photo; // blob
	@Column(name = "created_date")
	private LocalDate createdate; // date

	public LocalDate getCreatedate() {
		return createdate;
	}

	public void setCreatedate(LocalDate createdate) {
		this.createdate = createdate;
	}

	public LocalDate getModifydate() {
		return modifydate;
	}

	public void setModifydate(LocalDate modifydate) {
		this.modifydate = modifydate;
	}

	@Column(name = "modified_date")
	private LocalDate modifydate; // date

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Advertises [ Id = " + getId() + ", Title = " + getTitle() + ", Category = " + getCategory()
				+ ", Status = " + getStatus() + ", Price = " + getPrice() + ", Description = " + getDescription()
				+ ", Active = " + isActive() + ", Posted_by = " + getPosted_by() + ", Username = " + getUsername()
				+ ", Photo = " + Arrays.toString(getPhoto()) + ", Createdate = " + getCreatedate() + ", Modifydate = "
				+ getModifydate() + " ]";
	}

}
