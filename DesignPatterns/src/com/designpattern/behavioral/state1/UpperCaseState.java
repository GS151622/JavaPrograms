package com.designpattern.behavioral.state1;

public class UpperCaseState implements State{
	//private int count = 0;
	@Override
	public void WriteName(StateContext context, String name) {
		System.out.println(name.toUpperCase());
		//if(++count > 1)
			context.SetState(new LowerCaseState());
	}
}