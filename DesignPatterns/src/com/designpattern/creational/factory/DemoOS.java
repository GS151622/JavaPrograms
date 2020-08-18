package com.designpattern.creational.factory;

public class DemoOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OSFactory osf = new OSFactory();
		OS os = osf.getInstance("ANDROID");
		os.Specifications();
		
		os = osf.getInstance("IOS");
		os.Specifications();
		
		os = osf.getInstance("MAC");
		os.Specifications();
		
		os =osf.getInstance("WINDOWS");
		os.Specifications();		
	}
}
