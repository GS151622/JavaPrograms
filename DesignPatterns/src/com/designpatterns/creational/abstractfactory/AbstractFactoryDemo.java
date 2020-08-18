package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
		
		Shape shape = shapeFactory.getShape("Circle");
		Color color = colorFactory.getColor("Red");
		shape.Draw();
		color.Fill();
		
		shape = shapeFactory.getShape("Rectangle");
		color = colorFactory.getColor("Blue");
		shape.Draw();
		color.Fill();
		
		shape = shapeFactory.getShape("Square");
		color = colorFactory.getColor("Green");
		shape.Draw();
		color.Fill();
	}

}
