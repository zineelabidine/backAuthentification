package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.UserRole;

public interface RoleRepository extends JpaRepository<UserRole, Long>{
	
	public UserRole findByRoleName(String roleName);;

}
