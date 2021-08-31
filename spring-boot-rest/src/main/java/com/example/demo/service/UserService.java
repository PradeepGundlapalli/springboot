package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.SignupDAO;
import com.example.demo.dao.UserDAO;

@Service
public class UserService {
	
	@Autowired
	UserDAO dao;
	
	public Employee createEmployee(Employee emp) {
		
		dao.save(emp);
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) dao.findAll();
		
	}
	
public Employee getEmployeeId(String id) {
		
		Optional<Employee> e= dao.findById(id);
		  Employee e1=e.get();
		
		  return e1;
	}

}
