package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public interface SignupDAO extends CrudRepository<Employee, String>{

}
