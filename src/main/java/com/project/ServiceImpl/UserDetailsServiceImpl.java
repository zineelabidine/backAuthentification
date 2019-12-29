package com.project.ServiceImpl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.entities.AppUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
	@Autowired
	private UserServiceImpl userserviceimpl;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		AppUser user = userserviceimpl.finByEmail(email);
		if(user == null) throw new UsernameNotFoundException(email);
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		user.getRoles().forEach(r->{
			authorities.add(new SimpleGrantedAuthority(r.getRoleName()));
			
		});
		return new User(user.getEmail(),user.getPassword(),authorities);
	}

}
