package com.project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.Iservice.IroleService;
import com.project.entities.UserRole;
import com.project.repositories.RoleRepository;

public class UserRoleServiceImpl implements IroleService{
	@Autowired
	private RoleRepository roleRepo;
	

	@Override
	public UserRole save(UserRole userRole) {
		// TODO Auto-generated method stub
		return roleRepo.save(userRole);
	}

	@Override
	public UserRole update(UserRole userRole) {
		// TODO Auto-generated method stub
		return roleRepo.save(userRole);
	}

	@Override
	public void delete(Long id) {
		roleRepo.deleteById(id);
		
	}

	@Override
	public UserRole getById(Long id) {
		// TODO Auto-generated method stub
		return roleRepo.findById(id).get();
	}

	@Override
	public List<UserRole> getAll() {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}

}
