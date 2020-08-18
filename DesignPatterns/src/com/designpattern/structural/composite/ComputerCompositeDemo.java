package com.designpattern.structural.composite;

public class ComputerCompositeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Component hdd = new Leaf(2000, "HDD");
		Component mouse = new Leaf(2000, "Mouse");
		Component monitor = new Leaf(2000, "Monitor");
		Component ram = new Leaf(2000, "RAM");
		Component cpu = new Leaf(2000, "CPU");
		
		Composite ph = new Composite("Peripheral");
		Composite cabinate = new Composite("Cabinate");
		Composite motherboard = new Composite("Motherboard");
		Composite computer = new Composite("Computer");
		
		motherboard.AddComponent(ram);
		motherboard.AddComponent(cpu);
		
		cabinate.AddComponent(hdd);
		cabinate.AddComponent(motherboard);
		
		ph.AddComponent(mouse);
		ph.AddComponent(monitor);
		
		computer.AddComponent(cabinate);
		computer.AddComponent(ph);
		
		//ram.showPrice();
		computer.showPrice();
	}
}
