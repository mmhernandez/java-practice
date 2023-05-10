package com.codingdojo.models;

public class Calculator implements java.io.Serializable {

	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;
	
//	CONSTRUCTOR
	public Calculator() {
	}
	
	public Calculator(double operandOne, String operation, double operandTwo) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
		this.results = this.getResults();
	}
	
//	GETTERS
	public double getOperandOne() {
		return this.operandOne;
	}
	public double getOperandTwo() {
		return this.operandTwo;
	}
	
	public String getOperation() {
		return this.operation;
	}
	
//	SETTERS
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
//	OTHER METHODS
	private double performOperation() {
		if(this.operation.equals("+")) {
			return this.operandOne + this.operandTwo;
		} else if(this.operation.equals("-")) {
			return this.operandOne - this.operandTwo;
		} else {
			return 0;
		}
	}
	
	public double getResults() {
		return this.performOperation();
	}
	
}
