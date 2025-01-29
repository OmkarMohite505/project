package com.app;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entites.Role;
import com.app.entites.RoleEnum;



@SpringBootApplication
public class FinalApiApplication implements CommandLineRunner {
	
	@Autowired
	private com.app.repositories.RoleRepository roleRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(FinalApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Role role1 = new Role();
		role1.setRoleName(RoleEnum.ROLE_ADMIN);
		Role role2 = new Role();
		role2.setRoleName(RoleEnum.ROLE_USER);
		Set<Role> roles = new HashSet<Role>();
		roles.add(role1);
		roles.add(role2);
		for(Role role : roles) {
			Optional<Role> existingUser = roleRepo.findByRoleName(role.getRoleName());

            if (existingUser.isEmpty()) {
                // If the user doesn't exist, insert them
                roleRepo.save(role);
            }
		}
		
	}

}
