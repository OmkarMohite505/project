package com.app.repositories;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entites.Role;
import com.app.entites.RoleEnum;



public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(RoleEnum roleName);
	Set<Role> findByRoleNameIn(Set<RoleEnum> roles);
}
