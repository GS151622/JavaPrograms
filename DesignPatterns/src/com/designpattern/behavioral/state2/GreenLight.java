package com.designpattern.behavioral.state2;

public class GreenLight implements Receiver {

	public GreenLight() {
		
	}
	
	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Switching on green light");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("Switching off green light");
	}

}
