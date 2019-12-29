package com.project.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Iservice.IuserService;
import com.project.entities.AppUser;

@RestController
public class loginController {

	@Autowired
	private IuserService userService;
	
	
	@PostMapping("/ajouter")
	public AppUser save(@RequestBody AppUser user)
	{
		return userService.save(user);
		
	}
	
}
