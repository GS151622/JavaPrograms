package com.designpattern.behavioral.state2;

public class RedLight implements Receiver {

	public RedLight() {
		
	}
	
	@Override
	public void On() {
		// TODO Auto-generated method stub
		System.out.println("Switching on red light");
	}

	@Override
	public void Off() {
		// TODO Auto-generated method stub
		System.out.println("Switching off red light");
	}

}
