package com.designpatterns.creational.builder;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone.PhoneBuilder builder = new Phone.PhoneBuilder()
									.buildOS("Android")
									.buildOSVersion("11.0")
									.buildCamera("12 MP")
									.buildRam("8 GB")
									.buildSpace("128 GB");
		
		Phone phone = builder.build();
		System.out.println(phone.getOs());
		System.out.println(phone.getOsVersion());
		System.out.println(phone.getCamera());
		System.out.println(phone.getRam());
		System.out.println(phone.getSpace());

	}

}
