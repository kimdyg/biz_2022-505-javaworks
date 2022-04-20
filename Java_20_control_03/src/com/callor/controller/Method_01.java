package com.callor.controller;

public class Method_01 {

	public static void main(String[] args) {
		
		int intNum= num();
		System.out.println(intNum);
		
		
	} public static int num() {
	
	int intNum1= (int)(Math.random() * 100 +1);
	int intNum2= (int)(Math.random() * 100 +1);
	
	System.out.printf("\t%d + %d = %d\n", intNum1, intNum2, intNum1 + intNum2);
		return intNum1+intNum2;
	}
}
