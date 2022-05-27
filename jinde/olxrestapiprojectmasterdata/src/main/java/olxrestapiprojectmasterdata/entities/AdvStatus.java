package olxrestapiprojectmasterdata.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Master_details")
public class AdvStatus {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Integer Id;
	@Column(nullable = false, length = 100)
	private String status;
	public AdvStatus() {
		
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Adv_Status [Id=" + Id + ", status=" + status + "]";
	}

}
