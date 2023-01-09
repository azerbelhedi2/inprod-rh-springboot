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

import com.inprod.rh.models.Employee;
import com.inprod.rh.models.User;

import com.inprod.rh.services.UserService;

@RestController
@RequestMapping("/api/inprod")
public class EmployeeController {


	@Autowired
	UserService userService ; 

	
	

	@GetMapping("")
	public List<Employee> getAllEmployee() {
		return userService.findAllEmployee();
	}
	@PostMapping("")
	public Employee addUser( @RequestBody Employee   employee ) {
		
		employee.setRole("EMPLOYEE");
		userService.addUser(employee); 
		return employee ; 
	}
	@PatchMapping("")
	public User updateUser(@RequestBody Employee employee ) {
			User existingUser = userService.getUserById(employee.getId()) ; 
			existingUser.setUsername(employee.getUsername());
			existingUser.setEmail(employee.getEmail());
			existingUser.setPassword(employee.getPassword());
			existingUser.setRole(employee.getRole());
			userService.updateUser(existingUser); 
			
			return existingUser ;
			
	}
	
	@DeleteMapping("")
	public void deleteUser( long id  ) {

		userService.deleteUser(id);
	}
}
