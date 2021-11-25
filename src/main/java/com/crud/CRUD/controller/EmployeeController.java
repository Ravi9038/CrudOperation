package com.crud.CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.CRUD.model.Employee;
import com.crud.CRUD.services.EmployeeService;

@RestController
@RequestMapping("/api/users")

public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> get() {
		
		List<Employee> list = employeeService.get();
		
		return list;		
		
	}
	
}
