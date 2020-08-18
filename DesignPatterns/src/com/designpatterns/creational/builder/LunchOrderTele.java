package com.designpatterns.creational.builder;

public class LunchOrderTele {
	private String bread;
	private String condiment;
	private String dressings;
	private String veg;
	
	public LunchOrderTele(String bread){
		this.bread = bread;
	}
	
	public LunchOrderTele(String bread, String condiment){
		this(bread);
		this.condiment = condiment;
	}
	
	public LunchOrderTele(String bread, String condiment, String dressings){
		this(bread, condiment);
		this.dressings = dressings;
	}
	
	public LunchOrderTele(String bread, String condiment, String dressings, String veg){
		this(bread, condiment, dressings);
		this.veg = veg;
	}
	
	public String getBread() {
		return bread;
	}
	public String getCondiment() {
		return condiment;
	}
	public String getDressings() {
		return dressings;
	}
	public String getVeg() {
		return veg;
	}
}
