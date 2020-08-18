package com.designpattern.behavioral.state2;

public class YellowLight implements Receiver {

	public YellowLight(){
		
	}
	
	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Switching on yellow light");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("Switching off yellow light");
	}

}
