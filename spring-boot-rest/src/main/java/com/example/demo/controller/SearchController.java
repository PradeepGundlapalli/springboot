package com.example.demo.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Employee;
import com.example.demo.service.UserService;
import org.springframework.http.MediaType;

@RestController
public class SearchController {
	@Autowired
	UserService service;
	
	@GetMapping(value="/allemp",consumes = MediaType.ALL_VALUE )
	@ResponseBody
	public List<Employee> serachEmp() {	
		 
		
		List<Employee> elist=service.getAllEmployee();
		
	 
		
	 return elist;
	}
	
	@GetMapping(value="/getemp/{id}")
	public Employee serachEmpId(@PathVariable("id") String id) {	
		 
		
		 	return service.getEmployeeId(id);
	 
	}
}
