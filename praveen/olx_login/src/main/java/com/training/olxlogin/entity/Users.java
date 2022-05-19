package com.training.olxlogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, length = 20)
	private String username;
	@Column(nullable = true, length = 20)
	private String password;
	@Column(nullable = false, length = 50)
	private String roles;
	@Column(nullable = false)
	private boolean active;
	@Column(length = 45)
	private String firstname;
	@Column(length = 45)
	private String lastname;
	private String auth_token;

	public String getAuth_token() {
		return auth_token;
	}

	public void setAuth_token(String auth_token) {
		this.auth_token = auth_token;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Users [ Id = " + getId() + ", Username = " + getUsername() + ", Password = " + getPassword()
				+ ", Roles = " + getRoles() + ", Active = " + isActive() + ", Firstname = " + getFirstname()
				+ ", Lastname = " + getLastname() + " ]";
	}

}
