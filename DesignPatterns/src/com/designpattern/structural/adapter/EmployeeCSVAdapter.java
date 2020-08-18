package com.designpattern.structural.adapter;

public class EmployeeCSVAdapter implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return Integer.toString(instance.getId());
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getFirstname();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getLastname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getEmailAddress();
	}
	
	//This method is just for printing purpose only, this is not needed
	public String toString() {
		return "ID: " + instance.getId() + " FirstName: " + instance.getFirstname()+ "LastName: " + instance.getLastname() + " EmailAddress: " + instance.getEmailAddress();
	}
}
