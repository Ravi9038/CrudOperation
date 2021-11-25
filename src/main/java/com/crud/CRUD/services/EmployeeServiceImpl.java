package com.crud.CRUD.services;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.crud.CRUD.dao.EmloyeeDAO;
import com.crud.CRUD.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmloyeeDAO employeeDAO;
	@Transactional
	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return employeeDAO.get();
	}



}
