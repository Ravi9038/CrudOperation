package com.crud.CRUD.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.CRUD.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmloyeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		TypedQuery<Employee> query = currentSession.createQuery("from Employee", Employee.class);
		List<Employee> list = query.getResultList();
		return list;
		
	}


}
