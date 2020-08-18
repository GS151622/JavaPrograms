package com.designpattern.behavioral.state1;

public class StateContext {
	private State state;
	
	public StateContext() {
		state = new LowerCaseState();
	}
	
	public void SetState(State state) {
		this.state = state;
	}
	
	public void WriteName(String name) {
		state.WriteName(this, name);
	}
}