package com.home.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")
public class Employee {
	
	public String id;
	
	public String empName;
	public Long empId;
	public String empDesignation;
	
	public Employee(){}

	public Employee(String empName, String empDesignation) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empDesignation=" + empDesignation + "]";
	}
}
