package userrestapiexample1.entities;

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
    private String Name;
	@Column(name="user_dept")
   private String Dept;
	public User(){
	
	}
public Integer getUserId() {
	return userId;
}
public void setId(Integer id) {
	userId = id;
}
public String getUserName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDept() {
	return Dept;
}
public void setDept(String dept) {
	Dept = dept;
}
@Override
public String toString() {
	return "User [Id=" + userId + ", Name=" + Name + ", Dept=" + Dept + "]";
}
}
