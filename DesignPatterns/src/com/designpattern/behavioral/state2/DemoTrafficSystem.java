package com.designpattern.behavioral.state2;

public class DemoTrafficSystem {

	public static void main(String[] args) throws InterruptedException {
		TrafficSystem trafficeSystem = new TrafficSystem();
		
		while(true) {
			trafficeSystem.DisplayState();
			
			if(trafficeSystem.GetCurrentState() instanceof Yellow) {
				Thread.sleep(1000);
			}
			else {
				Thread.sleep(2000);
			}
			trafficeSystem.ChangeState();
		}
	}

}
