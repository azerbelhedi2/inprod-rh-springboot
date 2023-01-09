package com.inprod.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inprod.rh.models.Admin;
import com.inprod.rh.models.Employee;
import com.inprod.rh.models.RessourceHumaine;
import com.inprod.rh.models.User;
import com.inprod.rh.repository.UserRepository;

@Service
public class UserService implements IUserService{


	@Autowired
	UserRepository userRepository;
	@Autowired

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) {
		 return userRepository.findById(id); 
	}

	@Override
	public User addUser(User user) {
		if (user.getRole().equals("RH")){
			User newUser = new RessourceHumaine(); 
			newUser = user ;
			userRepository.save(newUser); 
			
		}else if (user.getRole().equals("EMPLOYEE")) {
			User newUser = new Employee(); 
			newUser= user ; 
			userRepository.save(newUser); 
		}else if (user.getRole().equals("ADMIN")) {
			User newUser = new Admin(); 
			newUser= user ; 
			userRepository.save(newUser); 
		}
		return user ;
		
		
	}

	@Override
	public User updateUser(User user) {
		
		userRepository.save(user); 
		
		return user; 
	}

	@Override
	public void deleteUser(long id) {
		User user = userRepository.findById(id); 
		userRepository.delete(user); 
		
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return userRepository.findEmployeeByRole("EMPLOYEE");
	}

//	@Override
//	public List<RessourceHumaine> findAllRh() {
//		// TODO Auto-generated method stub
//		return userRepository.findByRole("RH"); 
//	}
//
//	@Override
//	public List<Admin> findAllAdmin() {
//		// TODO Auto-generated method stub
//		return userRepository.findByRole("ADMIN"); 
//	}
}
