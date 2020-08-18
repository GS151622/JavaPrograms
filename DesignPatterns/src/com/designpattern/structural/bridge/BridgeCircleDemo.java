package com.designpattern.structural.bridge;

public class BridgeCircleDemo {
	public static void main(String a[]) {
		Shape redCircle = new Circle(new RedCircle());
		Shape greenCircle = new Circle(new GreenCircle());
		
		redCircle.Draw();
		greenCircle.Draw();
	}
}
