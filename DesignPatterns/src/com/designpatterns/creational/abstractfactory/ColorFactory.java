package com.designpatterns.creational.abstractfactory;

public class ColorFactory extends AbstractFactory{
	
	@Override
	public Shape getShape(String shape) {
		return null;
	}
	
	public Color getColor(String color) {
		if(color.equalsIgnoreCase("Red"))
			return new Red();
		else if(color.equalsIgnoreCase("Blue"))
			return new Blue();
		else if(color.equalsIgnoreCase("Green"))
			return new Green();
		else
			return null;
	}

}
