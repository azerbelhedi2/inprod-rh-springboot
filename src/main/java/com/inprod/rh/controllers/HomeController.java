package com.inprod.rh.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/inprod")
public class HomeController {
	
	@GetMapping("/testAdmin")
	public String admin() {
		return "This is Admin Page";
	}
	@GetMapping("/testRh")
	public String rh() {
		return "This is Ressource Humaine Page";
	}

		
}
