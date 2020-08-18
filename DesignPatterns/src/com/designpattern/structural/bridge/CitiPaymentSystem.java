package com.designpattern.structural.bridge;

public class CitiPaymentSystem implements IPaymentSystem {

	@Override
	public void ProcessPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		System.out.println("Using Citi payment system for "+ paymentSystem);
	}
}