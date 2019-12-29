package com.project.ServiceImpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.Iservice.IuserService;
import com.project.entities.AppUser;
import com.project.entities.AppUserRole;
import com.project.repositories.RoleRepository;
import com.project.repositories.UserRepository;
@Service
@Transactional
public class UserServiceImpl implements IuserService{
	@Autowired
	private BCryptPasswordEncoder crypt;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Override
	public AppUser save(AppUser user) {
		String hash=crypt.encode(user.getPassword());
		user.setPassword(hash);
		return userRepo.save(user);
	}
	@Override
	public AppUser update(AppUser user) {
		String hash=crypt.encode(user.getPassword());
		user.setPassword(hash);
		return userRepo.save(user);
	}
	@Override
	public void delete(Long id) {
		userRepo.deleteById(id);	
	}
	@Override
	public AppUser getbyId(Long id) {
		return userRepo.findById(id).get();
	}
	@Override
	public List<AppUser> getAll() {
		return userRepo.findAll();
	}
	@Override
	public void addRoleToUser(String email, String roleName) {
		AppUser user=userRepo.findByEmail(email);
		AppUserRole role=roleRepo.findByRoleName(roleName);
		user.getRoles().add(role);
	}
	@Override
	public AppUser finByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
	}
}
