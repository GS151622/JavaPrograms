package com.designpattern.behavioral.state1;

public class LowerCaseState implements State{
	@Override
	public void WriteName(StateContext context, String name) {
		System.out.println(name.toLowerCase());
		context.SetState(new UpperCaseState());
	}
}