package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.LoginDAO;

@Service
public class LoginService {
	
	@Autowired
	LoginDAO dao;
	
	public User createUser(User user) {
		
		dao.save(user);
		return user;
	}
	
	public List<User> getAllUser() {
		
		return (List<User>) dao.findAll();
		
	}

}
