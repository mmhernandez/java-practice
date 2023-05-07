package com.codingdojo.caranddriver;

public class Driver extends Car {

	public void drive() {
		System.out.println("Driving car");
		super.useGas(1);
		super.printRemainingGas();
	}
	
	public void useBoosters() {
		System.out.println("Using boosters");
		super.useGas(3);
		super.printRemainingGas();
	}
	
	public void refuel() {
		System.out.println("Refuling...");
		super.refillGas(2);
		super.printRemainingGas();
	}
}
