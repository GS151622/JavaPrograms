package com.designpattern.structural.bridge;

public class NetBankingPayment extends Payment{

	public NetBankingPayment(IPaymentSystem paymentsystem){
		super(paymentsystem);
	}
	
	@Override
	public void MakePayment() {
		// TODO Auto-generated method stub
		paymentSystem.ProcessPayment("Payment through net banking");
	}
}
