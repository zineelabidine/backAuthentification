package com.project.Iservice;
import java.util.List;
import com.project.entities.AppUserRole;
public interface IroleService {
	public AppUserRole save(AppUserRole userRole);
	public AppUserRole update(AppUserRole userRole);
	public void delete(Long id);
	public AppUserRole getById(Long id);
	public List<AppUserRole> getAll();
}
