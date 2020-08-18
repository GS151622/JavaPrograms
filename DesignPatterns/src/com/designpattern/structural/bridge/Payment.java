package com.designpattern.structural.bridge;

public abstract class Payment {
	protected IPaymentSystem paymentSystem;
	
	Payment(IPaymentSystem paymentSystem){
		this.paymentSystem = paymentSystem;
	}
	public abstract void MakePayment();
}
