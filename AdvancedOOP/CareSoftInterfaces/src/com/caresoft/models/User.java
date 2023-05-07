package com.caresoft.models;

public class User {
    protected Integer id;
    protected int pin;
    
//  CONSTRUCTOR
    public User(Integer id) {
    	this.id = id;
    }
    
//  GETTERS
    public Integer getId() {
    	return this.id;
    }
    
    public int getPin() {
    	return this.pin;
    }
    
    
//  SETTERS
    public void setPin(int pinNum) {
    	this.pin = pinNum;  	
    }
    
    
}

