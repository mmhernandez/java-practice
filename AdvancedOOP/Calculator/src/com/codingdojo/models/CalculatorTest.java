package com.codingdojo.models;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10.5, "+", 5.2);
		System.out.println(calc.getResults());

	}

}
