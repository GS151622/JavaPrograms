package escape.reference.com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Class with Escape Reference issue
//public class CustomerRecords {
//	private Map<String, Customer> records;
//
//	public CustomerRecords() {
//		this.records = new HashMap<String, Customer>();
//	}
//	
//	public void addCustomer(Customer c) {
//		records.put(c.getName(), c);
//	}
//	
//	//Here we have escape reference problem because we are returning the object which in turns returns the reference
//	public Map<String, Customer> getCustomer(){
//		return this.records;
//	}
//	
//	public void printCustomers() {
//		System.out.println(records);
//	}
//}


//Solution - Approach #1
//Implement the Iterable interface and return the iterator instead of getCustomer method.
//public class CustomerRecords implements Iterable<Customer>{
//	private Map<String, Customer> records;
//
//	public CustomerRecords() {
//		this.records = new HashMap<String, Customer>();
//	}
//	
//	public void addCustomer(Customer c) {
//		records.put(c.getName(), c);
//	}
//	
//	//Here we have escape reference problem because we are returning the object which in turns returns the reference
//	public Map<String, Customer> getCustomer(){
//		return this.records;
//	}
//	
//	public void printCustomers() {
//		System.out.println(records);
//	}
//
//	@Override
//	public Iterator<Customer> iterator() {
//		return records.values().iterator();
//	}
//}


//Solution - Approach #2
//Implement the Iterable interface and return the iterator instead of getCustomer method.
public class CustomerRecords{
	private Map<String, Customer> records;

	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		records.put(c.getName(), c);
	}
	
	//We can get rid of escape reference problem by not returning the actual objects reference, instead
	//returns the new Map object
	//This will create a copy of the maps, but what about the values in the map (if other objects), then still there is possibility
	//that developer can accidently change the value. To avoid this issue, we need to return immutable collection
	public Map<String, Customer> getCustomer(){
		//return (new HashMap<String, Customer>(this.records)); //with new map
		return (Collections.unmodifiableMap(this.records)); //with immutable collection (unmodifiablemap). This solves the problem
	}
	
	public void printCustomers() {
		System.out.println(records);
	}
}