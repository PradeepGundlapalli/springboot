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

import com.example.demo.bean.User;
import com.example.demo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
		@RequestMapping(method=RequestMethod.GET,value="/login")
		public ModelAndView ViewsignupPage() {
			ModelAndView obj = new ModelAndView("login");
			return obj;
		}
		
		@RequestMapping(method=RequestMethod.POST,value="/login1")
		public ModelAndView signup(HttpServletRequest req) {	
			
			String uId=req.getParameter("userId");
			String pass=req.getParameter("password");
		 
			User user = new User(uId, pass);
			
			 
			
			service.createUser(user);
			
			List<User> elist=service.getAllUser();
			
		 Iterator<User> it=elist.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			ModelAndView obj = new ModelAndView("success");
			return obj;
		}
		

}
