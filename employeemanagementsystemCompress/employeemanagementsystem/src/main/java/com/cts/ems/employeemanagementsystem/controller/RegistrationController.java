package com.cts.ems.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.ems.employeemanagementsystem.model.Employee;
import com.cts.ems.employeemanagementsystem.service.EmployeeService;

@Controller
public class RegistrationController {
	@Autowired
	private EmployeeService empService;

	@GetMapping("/index")
	public String index() {

		return "registrationpage";// View name
	}

	@GetMapping("/registration")
	public String registration(@RequestParam("first_name") String fName, @RequestParam("last_name") String lname,
			@RequestParam("gender") String gender, @RequestParam("dob") String dob, @RequestParam("city") String city,
			@RequestParam("country") String country, @RequestParam("pin") int pin, @RequestParam("phone") int pno) {

		Employee emp = new Employee(fName, lname, gender, dob, city, country, pin, pno);
		empService.addEmployee(emp);

		return "sucess";

	}

}
