package com.inprod.rh.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inprod.rh.models.Employee;
import com.inprod.rh.models.User;
import com.inprod.rh.repository.UserRepository;
import com.inprod.rh.services.UserService;



@RestController
@RequestMapping("/api/inprod/rh-app")
public class RhController {
	
	@Autowired
	UserService userService; 
	
	
	

	@GetMapping("/addEmployee/{username}/{password}/{firstName}/{lastName}/{email}/{matricule}/{soldeConge}")
	void addEmployee( @PathVariable("username") String username,
			@PathVariable("password") String password, @PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName, @PathVariable("email") String email,
			@PathVariable("matricule") String matricule,
			@PathVariable("soldeConge") int soldeConge) {
		Employee employee = new Employee();
		employee.setRole("EMPLOYEE");
		employee.setEmail(email); 
		employee.setFirstname(firstName); 
		employee.setLastname(lastName); 
		employee.setMatricule(matricule); 
		employee.setPassword(password); 
		employee.setSoldeConge(soldeConge); 
			userService.addUser(employee);
			
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllUser() {
		return userService.findAllEmployee();
		
	}
	
	@RequestMapping(value = "/removeEmployee/{id}")
	public void removeELeve( @PathVariable("id") Long id) {
		userService.deleteUser(id);
	}
	
//	@GetMapping(value = "/findEleve/{firstName}/{lastName}")
//	public Eleve getEleveByFirstNameAndLastName( @PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
//		return eleveRepository.findByFirstNameAndLastName( firstName, lastName);
//	}
	
//	@GetMapping(value = "/verify/{username}/{password}")
//	public Boolean verifyUser( @PathVariable("username") String username,@PathVariable("password") String password) {
//		if (eleveRepository.findByUsernameAndPassword(username, password) != null )
//		{
//			return true ; 
//		}
//		else 
//			return false; 
//	}
	
	
//	@GetMapping("/addNoteEleve/{idNotes}/{idEleve}")
//	void addProfileUser(@PathVariable("idNotes") long idNote, @PathVariable("idEleve") long idEleve) {
//		Eleve eleve = eleveRepository.findByIdEleve(idEleve);
//		NotesEleve notesEleve= noteRepository.findByIdNote(idNote);
//		eleve.setListNotes(notesEleve);
//		eleveRepository.save(eleve);
//		
//		
//	}
}
