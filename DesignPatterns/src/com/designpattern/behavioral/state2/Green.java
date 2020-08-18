package com.designpattern.behavioral.state2;

public class Green implements State {

	private Receiver receiver;
	private TrafficSystem trafficSystem;
	
	public Green(TrafficSystem trafficeSystem, Receiver receiver) {
		super();
		this.trafficSystem = trafficeSystem;
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
