package com.codingdojo.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		Bat b = new Bat();
		System.out.println(b.getEnergyLevel());
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		System.out.println(b.getEnergyLevel());
		
		b.eatHumans();
		b.eatHumans();
		System.out.println(b.getEnergyLevel());
		
		b.fly();
		b.fly();
		System.out.println(b.getEnergyLevel());
	}

}
