package com.callor.app;

public class Exec2 {

	public static void main(String[] args) {

			int pay = 3_928_880;
			
			int paper = (pay/ 50_000);
			System.out.println("5만원권 : " + paper);
			pay -= paper * 50000; 
			
			paper = (pay / 10_000);
			System.out.println("1만원권 : " + paper);
			pay -= paper * 10000; 
			
			paper = (pay / 5000);
			System.out.println("5천원권 : " + paper);
			pay -= paper * 5000;
			
			paper = (pay / 1000);
			System.out.println("천원원권 : " + paper);
			pay -= paper * 1000;
			
			paper = (pay / 500);
			System.out.println("5백원권 : " + paper);
			pay -= paper * 500;
			
			paper = (pay / 100);
			System.out.println("백원권 : " + paper);
			pay -= paper * 100;
			
			paper = (pay / 50);
			System.out.println("5십원권 : " + paper);
			pay -= paper * 50;
			
			paper = (pay / 10);
			System.out.println("십원권 : " + paper);
			pay -= paper * 10;
	}
}
