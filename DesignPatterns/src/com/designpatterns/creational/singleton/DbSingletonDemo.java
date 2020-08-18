package com.designpatterns.creational.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance1 = DbSingleton.getInstance(); 
		System.out.println("Instance1 - "+instance1);
		
		DbSingleton instance2 = DbSingleton.getInstance();
		System.out.println("Instance2 - "+ instance2);
		
		if(instance1 == instance2) {
			System.out.println("Both instances are same");
		}
	}
}
