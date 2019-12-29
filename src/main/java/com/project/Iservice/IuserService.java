package com.project.Iservice;
import java.util.List;
import com.project.entities.AppUser;
public interface IuserService {
	public AppUser save(AppUser user);
	public AppUser update(AppUser user);
	public void delete(Long id);
	public AppUser getbyId(Long id);
	public List<AppUser> getAll();
	public void addRoleToUser(String email,String roleName);
	public AppUser finByEmail(String email);
}
