package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Addition myAdder = new Addition();
		System.out.println(myAdder.addition(10, 20));
		
		Multiplication myMulti = new Multiplication();
		System.out.println(myMulti.multiplicator(200, 100));
		
		Division myDiv = new Division();
		System.out.println(myDiv.divide(6.5f, 3.7f));
		
		Subtract mySub = new Subtract();
		System.out.println(mySub.minus(7d, 2d));
	}
}
