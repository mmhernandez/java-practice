package com.codingdojo.zookeeper;

public class Bat extends Mammal {

//	CONSTRUCTOR
	public Bat() {
		super();
	}
	
	public void fly() {
		System.out.println("Flap flap flap");
		super.decreaseEnergy(50);
	}
	
	public void eatHumans() {
		super.increaseEnergy(25);
	}
	
	public void attackTown() {
		System.out.println("FIRE!");
		super.decreaseEnergy(100);
	}
}
