package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class Employee {

	 private long empID;
	 private String empName;
	 
	public long getEmpID() {
		return empID;
	}
	
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	 
	public Employee(long empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
		System.out.println("Pradeep......");
	}
	
	public Employee() {
		super();
		System.out.println("Pradeep Default......");
	}
}
