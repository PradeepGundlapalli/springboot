package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.SignupDAO;

@Service
public class SignupService {
	
	@Autowired
	SignupDAO dao;
	
	public Employee createEmployee(Employee emp) {
		
		dao.save(emp);
		return emp;
	}
	
	public List<Employee> getAllEmployee() {
		
		return (List<Employee>) dao.findAll();
		
	}

}
