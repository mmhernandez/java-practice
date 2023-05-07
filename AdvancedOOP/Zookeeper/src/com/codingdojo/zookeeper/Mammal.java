package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel;
	
//	CONSTRUCTOR
	public Mammal() {
		this.energyLevel = 100;
		System.out.println("New Mammal object created");
	}
	
//	GETTERS
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	
//	OTHER METHODS
	public int displayEnergy() {
		System.out.println("The energy level is " + this.energyLevel);
		return this.energyLevel;
	}
	
	public void decreaseEnergy(int amount) {
		if(this.energyLevel - amount >= 0) {
			this.energyLevel -= amount;
		}
		else {
			System.out.println("Not enough energy");
		}
	}
	
	public void increaseEnergy(int amount) {
		if(this.energyLevel + amount <= 100) {
			this.energyLevel += amount;
		}
		else {
			System.out.println("Energy at max!");
		}
	}
}
