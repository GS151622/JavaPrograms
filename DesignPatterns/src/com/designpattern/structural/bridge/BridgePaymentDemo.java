package com.designpattern.structural.bridge;

public class BridgePaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment = new NetBankingPayment(new BOAPaymentSystem());
		payment.MakePayment();
		
		payment = new CardPayment(new CitiPaymentSystem());
		payment.MakePayment();
		
		payment = new NetBankingPayment(new ChasePaymentSystem());
		payment.MakePayment();
		
		payment = new CardPayment(new BOAPaymentSystem());
		payment.MakePayment();
	}
}