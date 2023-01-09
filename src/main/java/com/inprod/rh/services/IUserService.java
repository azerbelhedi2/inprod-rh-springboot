package com.inprod.rh.services;

import java.util.List;

import com.inprod.rh.models.Admin;
import com.inprod.rh.models.Employee;
import com.inprod.rh.models.RessourceHumaine;
import com.inprod.rh.models.User;

public interface IUserService {

		
	 public List<User> findAll();
	 public List<Employee> findAllEmployee() ; 
//	 public List<RessourceHumaine> findAllRh(); 
//	 public List<Admin> findAllAdmin(); 
	 public User getUserById(long id) ; 
	 public User addUser(User user); 
	 public User updateUser(User user ) ; 
	 public void deleteUser(long id ); 
}
