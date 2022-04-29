package com.callor.app;

public class Exec1 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 25) + 25;
				if(num % 6 != 0) {
					System.out.println("학생수 : " + num + "\n피자개수" + ((num/6) +1));
				} else  {
					System.out.println("학생수 : " + num + "\n피자 갯수" + (num/6) );
				}
		}}
