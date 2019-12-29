package com.project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.Iservice.IroleService;
import com.project.entities.AppUserRole;
import com.project.repositories.RoleRepository;
@Service
@Transactional
public class UserRoleServiceImpl implements IroleService{
	@Autowired
	private RoleRepository roleRepo;
	

	@Override
	public AppUserRole save(AppUserRole userRole) {
		// TODO Auto-generated method stub
		return roleRepo.save(userRole);
	}

	@Override
	public AppUserRole update(AppUserRole userRole) {
		// TODO Auto-generated method stub
		return roleRepo.save(userRole);
	}

	@Override
	public void delete(Long id) {
		roleRepo.deleteById(id);
		
	}

	@Override
	public AppUserRole getById(Long id) {
		// TODO Auto-generated method stub
		return roleRepo.findById(id).get();
	}

	@Override
	public List<AppUserRole> getAll() {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}

}
