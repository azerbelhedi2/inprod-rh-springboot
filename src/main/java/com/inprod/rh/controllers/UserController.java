package com.inprod.rh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inprod.rh.models.User;
import com.inprod.rh.services.UserService;

@RestController
@RequestMapping("/api/inprod/admin")
public class UserController {
	

	@Autowired
	UserService userService ; 

	

	@GetMapping("")
	public List<User> getAllUser() {

		return userService.findAll();

	}
	@PostMapping("")
	public User addUser( @RequestBody User   user ) {
		
		user.setRole("ADMIN");
		userService.addUser(user); 
		return user ; 
	}
	@PatchMapping("")
	public User updateUser(@RequestBody User user ) {
			User existingUser = userService.getUserById(user.getId()) ; 
			existingUser.setUsername(user.getUsername());
			existingUser.setEmail(user.getEmail());
			existingUser.setPassword(user.getPassword());
			existingUser.setRole(user.getRole());
			userService.updateUser(existingUser); 
			
			return existingUser ;
			
	}
	
	@DeleteMapping("")
	public void deleteUser( long id  ) {

		userService.deleteUser(id);
	}

}
