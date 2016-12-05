package com.home.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Document(collection="Employee")
public class Employee {
	
	private String id;
	private String empName;
	private Date dob;
	//@Indexed(unique=true)
	private Long empId;
	private String empDesignation;
	
	public Employee(){}

	public Employee(String empName, Date dob, String empDesignation) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.empDesignation = empDesignation;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	
	
	
	

}
