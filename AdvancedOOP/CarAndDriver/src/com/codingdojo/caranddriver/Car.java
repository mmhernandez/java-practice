package com.codingdojo.caranddriver;

public class Car {

	private int gas;
	
//	CONSTRUCTOR
	public Car() {
		this.gas = 10;
	}
	
//	GETTERS
	public int getGas() {
		return this.gas;
	}
	
//	OTHER METHODS
	public void useGas(int amount) {
		if(this.gas >= amount) {
			this.gas -= amount;
		}
		else {
			System.out.println("Not enough gas");
		}
	}
	
	public void refillGas(int amount) {
		if(this.gas + amount <= 10) {
			this.gas += amount;
		}
		else {
			System.out.println("Refill not needed");
		}
	}
	
	public void printRemainingGas() {
		System.out.println("Gas remaining: " + this.gas + "/10");
	}
}
