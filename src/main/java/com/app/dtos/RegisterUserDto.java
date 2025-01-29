package com.app.dtos;

import java.util.HashSet;
import java.util.Set;

import com.app.entites.Role;
import com.app.entites.RoleEnum;

public class RegisterUserDto {
    private String email;
    
    private String password;
    
    private String fullName;
    private Set<RoleEnum> userRoles = new HashSet<RoleEnum>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Set<RoleEnum> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<RoleEnum> userRoles) {
		this.userRoles = userRoles;
	}
	
	
    
    
}
