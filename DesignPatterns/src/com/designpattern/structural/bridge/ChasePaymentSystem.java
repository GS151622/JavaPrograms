package com.designpattern.structural.bridge;

public class ChasePaymentSystem implements IPaymentSystem{

	@Override
	public void ProcessPayment(String paymentSystem) {
		System.out.println("Using Chase payment system for "+ paymentSystem);
	}
}
