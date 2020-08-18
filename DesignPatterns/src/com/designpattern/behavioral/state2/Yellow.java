package com.designpattern.behavioral.state2;

public class Yellow implements State {

	private TrafficSystem trafficSystem;
	private Receiver receiver;
	
	public Yellow(TrafficSystem trafficSystem, Receiver receiver) {
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
		//trafficSystem.SetPreviousState(this);
		
		//if(trafficSystem.GetPreviousState() == trafficSystem.GetGreenState())
		if(trafficSystem.GetPreviousState() instanceof Green)
			trafficSystem.SetCurrentState(trafficSystem.GetRedState());
		else
			trafficSystem.SetCurrentState(trafficSystem.GetGreenState());

	}

	@Override
	public void DisplayState() {
		receiver.On();
	}

}
