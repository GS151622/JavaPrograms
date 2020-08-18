package com.designpattern.behavioral.state2;

public class Red implements State {

	private TrafficSystem trafficSystem;
	private Receiver receiver;
	
	public Red(TrafficSystem trafficSystem, Receiver receiver) {
		this.trafficSystem = trafficSystem;
		this.receiver = receiver;
	}
	
	public TrafficSystem GetTrafficeSystem() {
		return trafficSystem;
	}
	
	public void SeTrafficSystem(TrafficSystem trafficSystem) {
		this.trafficSystem = trafficSystem;
	}
	
	public Receiver GetReceiver() {
		return receiver;
	}
	
	public void SetReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	
	@Override
	public void ChangeState() {
		receiver.Off();
		trafficSystem.SetPreviousState(this);
		trafficSystem.SetCurrentState(trafficSystem.GetYellowState());

	}

	@Override
	public void DisplayState() {
		receiver.On();
	}

}
