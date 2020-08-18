package escape.reference.com;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		//ShowProblem();
		//Approach1();
		Approach2();
	}
	
//	public static void ShowProblem() {
//		// TODO Auto-generated method stub
//		CustomerRecords cr = new CustomerRecords();
//		cr.addCustomer(new Customer("Pavitra"));
//		cr.addCustomer(new Customer("Sushil"));
//		
//		System.out.print("Printing customers from Customer Records object: ");
//		cr.printCustomers();
//		
//		Map<String, Customer> myCustomers = cr.getCustomer();
//		System.out.println("Printing customers from Map: "+ myCustomers);
//		myCustomers.clear(); //This clears the actual map, which is escape reference problem
//		System.out.println("Printing customers from Map after clear call: "+ myCustomers);
//		
//		System.out.print("Printing customers from Customer Records object after above clear call: ");
//		cr.printCustomers(); 
//		System.out.println("PROBLEM: The original map got cleared!!!");
//	}

	//Approach #1 - With Iterable interface implementation
//	public static void Approach1() {
//		// TODO Auto-generated method stub
//		CustomerRecords cr = new CustomerRecords();
//		cr.addCustomer(new Customer("Pavitra"));
//		cr.addCustomer(new Customer("Sushil"));
//		
//		System.out.print("Printing customers from Customer Records object: ");
//		cr.printCustomers();
//		
//		
//		System.out.println("Printing customers from Map: ");
//		for(Customer c: cr) {
//			System.out.println(c);
//		}
//		
//		cr.iterator().remove();//We can call remove method on iterator to remove data which still means our CustomerRecords class is still immutable
//		
//		System.out.println("Printing customers from Map after clear call: ");
//		for(Customer c: cr) {
//			System.out.println(c);
//		}
//		
//		System.out.print("Printing customers from Customer Records object after above clear call: ");
//		cr.printCustomers(); 
//		
//	}
	
	//Approach #2
	public static void Approach2() {
		// TODO Auto-generated method stub
		CustomerRecords cr = new CustomerRecords();
		cr.addCustomer(new Customer("Pavitra"));
		cr.addCustomer(new Customer("Sushil"));
		
		System.out.print("Printing customers from Customer Records object: ");
		cr.printCustomers();
		
		Map<String, Customer> myCustomers = cr.getCustomer();
		System.out.println("Printing customers from Map: "+ myCustomers);
		//myCustomers.clear(); //Throws unsupported operation exception. Commenting this line of code
		//System.out.println("Printing customers from Map after clear call: "+ myCustomers);
		
		System.out.print("Printing customers from Customer Records object after above clear call: ");
		cr.printCustomers(); 
		System.out.println("PROBLEM: The original map got cleared!!!");
	}
}
