package com.designpatterns.creational.builder;

public class LunchOrder {
	
	public static class LunchBuilder{
		private String bread;
		private String condiment;
		private String dressings;
		private String veg;
		
		public LunchBuilder() {
			
		}
		
		public LunchBuilder buildBread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public LunchBuilder buildCondiments(String condiment) {
			this.condiment = condiment;
			return this;
		}
		
		public LunchBuilder buildDressing(String dressings) {
			this.dressings = dressings;
			return this;
		}
		
		public LunchBuilder buildVeg(String veg) {
			this.veg = veg;
			return this;
		}
		
		//Build method
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		
	}
	
	private String bread;
	private String condiment;
	private String dressings;
	private String veg;
	
	private LunchOrder(LunchBuilder builder) {
		this.bread = builder.bread;
		this.condiment = builder.condiment;
		this.dressings = builder.dressings;
		this.veg = builder.veg;
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
