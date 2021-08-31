package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.User;

@Repository
public interface LoginDAO extends CrudRepository<User, String>{

}
