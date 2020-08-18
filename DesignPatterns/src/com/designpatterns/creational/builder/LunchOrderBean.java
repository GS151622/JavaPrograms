package com.designpatterns.creational.builder;

public class LunchOrderBean {
	private String bread;
	private String condiment;
	private String dressings;
	private String veg;
	
	public LunchOrderBean() {
		
	}
	
	public String getBread() {
		return bread;
	}
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public String getCondiment() {
		return condiment;
	}
	public void setCondiment(String condiment) {
		this.condiment = condiment;
	}
	
	public String getDressings() {
		return dressings;
	}
	public void setDressings(String dressings) {
		this.dressings = dressings;
	}
	
	public String getVeg() {
		return veg;
	}
	public void setVeg(String veg) {
		this.veg = veg;
	}
}
