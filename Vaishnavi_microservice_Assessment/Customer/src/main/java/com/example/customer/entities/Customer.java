package com.example.customer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Customer {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "cust_id")
private int id;
@Column(name = "cust_name")
private String name;
@Column(name = "cust_no")
private int contact_no;



public int getId() {
return id;
}



public void setId(int id) {
this.id = id;
}



public String getName() {
return name;
}



public void setName(String name) {
this.name = name;
}



public int getContact_no() {
return contact_no;
}



public void setContact_no(int contact_no) {
this.contact_no = contact_no;
}



@Override
public String toString() {
return "Customer [ Id = " + getId() + ", Name = " + getName() + ", Contact_no = " + getContact_no() + "]";
}



}