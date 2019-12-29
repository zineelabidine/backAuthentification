package com.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.AppUserRole;

public interface RoleRepository extends JpaRepository<AppUserRole, Long>{
	
	public AppUserRole findByRoleName(String roleName);;

}
