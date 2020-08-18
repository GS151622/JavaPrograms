package com.designpattern.structural.bridge;


public class Circle extends Shape {

	public Circle(DrawAPI drawAPI) {
		super(drawAPI);
	}
	
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		drawAPI.DrawCircle();
	}

}
