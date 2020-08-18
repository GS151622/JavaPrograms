package com.designpattern.structural.adapter;

public class EmployeeLdapAdapter implements Employee {

	private EmployeeLdap instance;
	
	
	public EmployeeLdapAdapter(EmployeeLdap instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}
	
	//This method is just for printing purpose only, this is not needed
	public String toString() {
		return "ID: " + instance.getCn() + " FirstName: " + instance.getGivenName()+ "LastName: " + instance.getSurName() + " EmailAddress: " + instance.getMail();
	}
}
