package olxrestapiprojectmasterdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="categories_details")
public class Categories {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable = false, length = 100)
private String name;
	@Column(nullable = false, length = 100)
private String description;
    public Categories() {
	
}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

@Override
public String toString() {
	return "Categories [name=" + name + ", description=" + description + "]";
}
}