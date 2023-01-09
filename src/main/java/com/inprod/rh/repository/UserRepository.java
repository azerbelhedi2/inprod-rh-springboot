package com.inprod.rh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inprod.rh.models.Employee;
import com.inprod.rh.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

		User findByUsername(String username); 
		User findById(long id); 
		List<Employee> findEmployeeByRole(String Role); 
		Employee findByUsernameAndPassword(String username , String password); 
		Employee findByFirstnameAndLastname(String firstname , String lastname); 
		Employee  findByMatricule(String matricule);
		
}
