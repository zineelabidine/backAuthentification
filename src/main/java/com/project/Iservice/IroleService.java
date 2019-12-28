package com.project.Iservice;
import java.util.List;
import com.project.entities.UserRole;
public interface IroleService {
	public UserRole save(UserRole userRole);
	public UserRole update(UserRole userRole);
	public void delete(Long id);
	public UserRole getById(Long id);
	public List<UserRole> getAll();
}
