package com.designpattern.behavioral.state2;

public class TrafficSystem {
	State greenState;
	State redState;
	State yellowState;
	State currentState;
	State previousState;
	
	public TrafficSystem() {
		greenState = new Green(this, new GreenLight());
		redState = new Red(this, new RedLight());
		yellowState = new Yellow(this, new YellowLight());
		
		currentState = new Green(this, new GreenLight());
		previousState = new Green(this, new YellowLight());
	}
	
	public State GetGreenState() {
		return greenState;
	}
	
	public void SetGreenState(State greenState) {
		this.greenState = greenState;
	}
	
	public State GetRedState() {
		return redState;
	}
	
	public void SetRedState(State redState) {
		this.redState = redState;
	}
	
	public State GetYellowState() {
		return yellowState;
	}
	
	public void SetYellowState(State yellowState) {
		this.yellowState = yellowState;
	}
	
	public State GetCurrentState() {
		return currentState;
	}
	
	public void SetCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public State GetPreviousState() {
		return previousState;
	}
	
	public void SetPreviousState(State previousState) {
		this.previousState = previousState;
	}
	
	public void ChangeState() {
		GetCurrentState().ChangeState();
	}
	
	public void DisplayState() {
		GetCurrentState().DisplayState();
	}
}
