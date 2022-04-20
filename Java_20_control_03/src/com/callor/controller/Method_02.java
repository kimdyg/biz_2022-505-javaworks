package com.callor.controller;

public class Method_02 {

	public static void main(String[] args) {
		
		System.out.println("num1 + num2 = " + add());
		System.out.println("num1 * num2 = " + multi());
		
	}
	public static int add() { 
		
		int num1 = (int)(Math.random() *100) +1;
		int num2 = (int)(Math.random() *100) +1;
		return num1 + num2;
	}
	public static int multi() { 
		
		int num1 = (int)(Math.random() *100) +1;
		int num2 = (int)(Math.random() *100) +1;
		return num1 * num2;
	}
}
