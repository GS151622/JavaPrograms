package com.designpatterns.creational.builder;

public class LunchOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LunchOrder.LunchBuilder lunchBuilder = new LunchOrder.LunchBuilder();
		lunchBuilder.buildBread("Wheat").buildCondiments("Lettuce").buildDressing("Mustard").buildVeg("Paneer");
		LunchOrder lunchOrder = lunchBuilder.build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiment());
		System.out.println(lunchOrder.getDressings());
		System.out.println(lunchOrder.getVeg());
	}
}
