package com.designpattern.behavioral.state1;

public class StateDemo {

	public static void main(String[] args) {
		StateContext stateContext = new StateContext();

		stateContext.WriteName("Monday");
		stateContext.WriteName("Tuesday");
		stateContext.WriteName("Wednesday");
		stateContext.WriteName("Thursday");
		stateContext.WriteName("Friday");
		stateContext.WriteName("Saturday");
		stateContext.WriteName("Sunday");
	}
}
