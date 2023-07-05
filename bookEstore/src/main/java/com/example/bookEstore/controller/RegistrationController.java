package com.example.bookEstore.controller;

import com.example.bookEstore.model.Customer;
import com.example.bookEstore.service.CustomerService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	private CustomerService custService;

	@GetMapping("/index")
	public String index() {
		LOGGER.info("Running successfully");
		return "loginpage";
	}

	@GetMapping("/registration")
	public String registration(
			@RequestParam("firstName") String fName, 
			@RequestParam("lastName") String lname,
			@RequestParam("addrs") String addrs, 
			@RequestParam("email") String email, 
			@RequestParam("pass") String pass) {

		Customer cust = new Customer(fName, lname, addrs, email, pass);
		custService.addCustomer(cust);

		return "loginpage";

	}
	@GetMapping("/loginpage")
	public  String login(
			@RequestParam("email") String email,
			@RequestParam("pass") String pass 
			) {
		LOGGER.info("login Running successfully");
		Boolean rs = custService.loginCustomer(email, pass);
		if(rs) {
			return "homepage";
		}
		return "loginpage";
	}
	@GetMapping("/redg")
	public String redg() {
		return "registrationpage";
	}
	

}
