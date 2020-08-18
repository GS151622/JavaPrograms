package com.designpattern.structural.bridge;

public class BOAPaymentSystem implements IPaymentSystem {

	@Override
	public void ProcessPayment(String paymentSystem) {
		// TODO Auto-generated method stub
		System.out.println("Using BOA payment system for "+ paymentSystem);
	}
}