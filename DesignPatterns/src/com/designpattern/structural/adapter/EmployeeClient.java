package com.designpattern.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employeeFromDB = new EmployeeDB("1", "Sushil", "Sharma", "sushil.sharma@abbott.com");
		
		employees.add(employeeFromDB);
		
		//We can't assign EmployeeLdap object int Employee, we need adapter here
		//Employee employeeLdap = new EmployeeLdap("2", "Sharma", "Sushil", "sushilsharma@hcl.com"); 
		
		EmployeeLdap employeeLdap = new EmployeeLdap("2", "Sharma", "Sushil", "sushilsharma@hcl.com"); 
		employees.add(new EmployeeLdapAdapter(employeeLdap));
		
		//We can't assign EmployeeCSV object into Employee interface, there is need of adapter class here
		//Employee employeeCSV = new EmployeeCSV("3,Pavitra,Sharma,pavisharma@paypal.com");
		
		EmployeeCSV employeeCSV = new EmployeeCSV("3,Pavitra,Sharma,pavisharma@paypal.com");
		employees.add(new EmployeeCSVAdapter(employeeCSV));
		
		return employees;
	}
}