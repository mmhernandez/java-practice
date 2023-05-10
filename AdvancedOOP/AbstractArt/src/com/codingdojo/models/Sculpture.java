package com.codingdojo.models;

public class Sculpture extends Art {

	private String material;
	
//	CONSTRUCTOR
	public Sculpture (String material) {
		this.material = material;
	}

//	GETTERS
	public String getMaterial() {
		return material;
	}

//	SETTERS
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void viewArt() {
		System.out.println("This sculpture was created with " + this.material);
	}
	

	
}
