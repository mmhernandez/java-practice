package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		
		Gorilla g = new Gorilla();
		System.out.println(g.getEnergyLevel());
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		System.out.println(g.getEnergyLevel());
		
		g.eatBananas();
		g.eatBananas();
		System.out.println(g.getEnergyLevel());
//		
		g.climb();
		System.out.println(g.getEnergyLevel());
	}
}

