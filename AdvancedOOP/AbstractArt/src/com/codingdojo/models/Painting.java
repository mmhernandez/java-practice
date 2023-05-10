package com.codingdojo.models;

public class Painting extends Art {
	private String paintType;
	
//	CONSTRUCTOR
	public Painting(String paintType) {
		this.paintType = paintType;
	}
	
//	GETTERS
	public String getPaintType() {
		return this.paintType;
	}
	
//	SETTERS
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	

	@Override
	public void viewArt() {
		System.out.println("This painting was created with " + this.paintType);
	}
}
