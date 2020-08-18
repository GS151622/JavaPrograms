package com.designpattern.creational.factory;

public class OSFactory {
	public OS getInstance(String strOS) {
		if(strOS.equals("ANDROID"))
			return new Android();
		else if(strOS.equals("IOS"))
			return new IOS();
		else if(strOS.equals("MAC"))
			return new Mac();
		else
			return new Windows();
	}
}
