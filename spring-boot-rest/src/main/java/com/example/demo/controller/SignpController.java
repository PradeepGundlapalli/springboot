package com.example.demo.controller;

import java.net.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Employee;
import com.example.demo.service.SignupService;

@Controller
public class SignpController {

	@Autowired
	SignupService service;
	
		@RequestMapping(method=RequestMethod.GET,value="/signup")
		public ModelAndView ViewsignupPage() {
			ModelAndView obj = new ModelAndView("signup");
			return obj;
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/signup1")
		public ModelAndView signup(HttpServletRequest req) {	
			String eId=req.getParameter("empId");
			String eName=req.getParameter("empName");
			String email=req.getParameter("empEmail");
			
			Employee emp= new Employee();
			emp.setEmpId(eId);
			emp.setEmpName(eName);
			emp.setEmpEmail(email);
			
			service.createEmployee(emp);
			
			List<Employee> elist=service.getAllEmployee();
			
		 Iterator<Employee> it=elist.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			ModelAndView obj = new ModelAndView("success");
			return obj;
		}
		

}
