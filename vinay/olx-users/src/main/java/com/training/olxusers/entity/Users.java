package com.training.olxusers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false)
private Integer id;
@Column(nullable=false,length = 20)
private String username;
@Column(nullable = false,length = 20)
private String password;
@Column(nullable = false, length = 50)
private String roles;
@Column(nullable = false)
private Active active;
@Column(length = 50)
private String firstname;
@Column(length = 45)
private String lastname;




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
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + ", firstname="
			+ firstname + ", lastname=" + lastname + "]";
}

}
