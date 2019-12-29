package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.project.Iservice.IroleService;
import com.project.Iservice.IuserService;
import com.project.entities.AppUser;
import com.project.entities.AppUserRole;

@SpringBootApplication
public class BackAuthentificationApplication implements CommandLineRunner{
	@Autowired
	private IuserService userservice;
	@Autowired
	private IroleService roleService;
	
	@Bean
	public BCryptPasswordEncoder getBCPE() {

		return new BCryptPasswordEncoder();
	}


	public static void main(String[] args) {
		SpringApplication.run(BackAuthentificationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AppUser user1=new AppUser(null, "zineelabidine", "bakher", "bakher@gmail.com", "1234");
		AppUserRole role=new AppUserRole(null, "ADMIN");
		userservice.save(user1);
		roleService.save(role);
		userservice.addRoleToUser("bakher@gmail.com", "ADMIN");
		
	}

}
