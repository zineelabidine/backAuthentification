package com.project.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.project.Iservice.IuserService;
import com.project.entities.User;
import com.project.entities.UserRole;
import com.project.repositories.RoleRepository;
import com.project.repositories.UserRepository;
public class UserServiceImpl implements IuserService{
	@Autowired
	private BCryptPasswordEncoder crypt;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private RoleRepository roleRepo;
	@Override
	public User save(User user) {
		String hash=crypt.encode(user.getPassword());
		user.setPassword(hash);
		return userRepo.save(user);
	}
	@Override
	public User update(User user) {
		String hash=crypt.encode(user.getPassword());
		user.setPassword(hash);
		return userRepo.save(user);
	}
	@Override
	public void delete(Long id) {
		userRepo.deleteById(id);	
	}
	@Override
	public User getbyId(Long id) {
		return userRepo.findById(id).get();
	}
	@Override
	public List<User> getAll() {
		return userRepo.findAll();
	}
	@Override
	public void addRoleToUser(String email, String roleName) {
		User user=userRepo.findByEmail(email);
		UserRole role=roleRepo.findByRoleName(roleName);
		user.getRoles().add(role);
	}
}
