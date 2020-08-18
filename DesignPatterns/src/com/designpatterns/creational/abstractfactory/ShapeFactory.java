package com.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shape.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shape.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
