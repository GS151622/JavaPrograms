package com.designpattern.structural.composite;

public class EmployeeCompositeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ceo = new Employee(1,"CEO", "Sharma", 1000);
		Employee headSales = new Employee(1,"HeadSales", "Sharma", 750);
		Employee headMarketing = new Employee(1,"HeadMarketing", "Sharma", 750);
		Employee clerk1 = new Employee(1,"Clerk1", "Sharma", 400);
		Employee clerk2 = new Employee(1,"Clerk2", "Sharma", 400);
		Employee salesExecutive1 = new Employee(1,"SalesExecutive2", "Sharma", 350);
		Employee salesExecutive2 = new Employee(1,"SalesExecutive2", "Sharma", 350);
		
		ceo.AddEmployee(headSales);
		ceo.AddEmployee(headMarketing);
		
		headSales.AddEmployee(salesExecutive1);
		headSales.AddEmployee(salesExecutive2);
		
		headMarketing.AddEmployee(clerk1);
		headMarketing.AddEmployee(clerk2);
		
		//System.out.println(ceo);
		
		for(Employee e: ceo.getSubordinates()) {
			System.out.println(e);
		}
	}
}
