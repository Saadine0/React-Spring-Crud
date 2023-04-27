package com.crud.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.crud.CRUD.model.Employee;

@CrossOrigin(origins =   "http://localhost:8080/api/v1/employees")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	private com.crud.CRUD.repository.EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
}
