package com.app.entites;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Enumerated(EnumType.STRING)
	@Column(unique = true)
	private RoleEnum roleName;

	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public RoleEnum getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleEnum roleName) {
		this.roleName = roleName;
	}
	
	
}
