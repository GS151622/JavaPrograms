package com.designpatterns.creational.builder;

public class LunchOrderBranDemo {

	public static void main(String[] args) {
		//LunchOrderBean lunchOrderBean = new LunchOrderBean();
		
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiment("Lettuce");
//		lunchOrderBean.setDressings("Mustard");
//		lunchOrderBean.setVeg("Paneer");
//		System.out.println(lunchOrderBean.getBread());
//		System.out.println(lunchOrderBean.getCondiment());
//		System.out.println(lunchOrderBean.getDressings());
//		System.out.println(lunchOrderBean.getVeg());
		
		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Paneer");
		
		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiment());
		System.out.println(lunchOrderTele.getDressings());
		System.out.println(lunchOrderTele.getVeg());
	}

}
