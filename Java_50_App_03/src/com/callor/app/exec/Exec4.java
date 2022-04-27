package com.callor.app.exec;

public class Exec4 {

	/*
	 *  1 ~ 100 까지 임의 수를 생성하고
	 *  그 수가 소수(prime number)인지 판별하라
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 1;
		
	
		if(num == 1) {
			System.out.printf("%d = 소수 다", num);
		} else if (num == 2) {
			System.out.printf("%d = 소수 다", num);
		} else if (num == 3) {
			System.out.printf("%d = 소수 다", num);
		} else if (num == 5) {
			System.out.printf("%d = 소수 다", num);
		} else if(num % 2 == 0) {
			System.out.printf("%d = 소수 아니다", num);
		} else if (num % 3 == 0) {
			System.out.printf("%d = 소수 아니다", num);
		} else if (num % 5 == 0) {
			System.out.printf("%d = 소수 아니다", num);
		} else {
			System.out.printf("%d = 소수 다", num);
		}
		}
	}
