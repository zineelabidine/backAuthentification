package com.project.Iservice;
import java.util.List;
import com.project.entities.User;
public interface IuserService {
	public User save(User user);
	public User update(User user);
	public void delete(Long id);
	public User getbyId(Long id);
	public List<User> getAll();
	public void addRoleToUser(String email,String roleName);
}
