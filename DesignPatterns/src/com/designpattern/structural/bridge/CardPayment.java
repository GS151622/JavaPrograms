package com.designpattern.structural.bridge;

public class CardPayment extends Payment{
	
	public CardPayment(IPaymentSystem paymentsystem) {
		super(paymentsystem);
	}
	
	public void MakePayment() {
		paymentSystem.ProcessPayment("Payment through card");
	}
}
