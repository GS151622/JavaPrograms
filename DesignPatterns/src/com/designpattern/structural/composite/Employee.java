package com.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private int empId;
	private String empFirstName;
	private String empLastName;
	private int empSal;
	
	List<Employee> subordinates;
	
	public Employee(int empId, String empFirstName, String empLastName, int empSal) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSal = empSal;
		
		subordinates = new ArrayList<Employee>();
		
	}
	
	public void AddEmployee(Employee emp) {
		subordinates.add(emp);
	}
	
	public void RemoveEmployee(Employee emp) {
		subordinates.remove(emp);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSal=" + empSal + ", subordinates=" + subordinates + "]";
	}
}
