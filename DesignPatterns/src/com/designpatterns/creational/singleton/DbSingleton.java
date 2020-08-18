package com.designpatterns.creational.singleton;

//Singleton design pattern
public class DbSingleton {
	//private static DbSingleton Instance = new DbSingleton(); //for quick load	
	//private static DbSingleton instance = null; //for lazy load
	private static volatile DbSingleton instance = null; //for making thread safe
	
	private DbSingleton() {
		if(instance != null) //To avoid reflection creating the object
			throw new RuntimeException("Use getInstance method for instantiating object");
	}
	
	//For quick load
//	public static DbSingleton getInstance() {
//		return instance;
//	}
	
	//For Lazy load
//	public static DbSingleton getInstance() {
//		if(instance == null)
//			instance = new DbSingleton();
//		return instance;
//	}
	
	//Make getInstance thread safe as well as lzily loaded
	public static DbSingleton getInstance() {
		if(instance == null)
			synchronized(DbSingleton.class) {
				if(instance == null) //Checking twice because before this thread locks, someone else might have created the instance
					instance = new DbSingleton();
			}
		return instance;
	}
}
