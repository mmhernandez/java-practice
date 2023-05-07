package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
//	CONSTRUCTOR
	public Gorilla() {
		super();
		System.out.println("New Gorilla object created");
	}

	
//	OTHER METHODS
	public void throwSomething() {
		System.out.println("Throwing something");
		super.decreaseEnergy(5);
	}
	
	public void eatBananas() {
		System.out.println("Yummy bananas");
		super.increaseEnergy(10);
	}
	
	public void climb() {
		System.out.println("Tree = climbed");
		super.decreaseEnergy(10);
	}
}
