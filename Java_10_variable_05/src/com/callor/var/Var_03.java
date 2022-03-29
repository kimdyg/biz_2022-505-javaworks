package com.callor.var;

public class Var_03 {

	public static void main(String[] args) {
		
		double doNum1 = 0.0; 
		double doNum2 = 0.0; 
		
		doNum1 = Math.random() * 1000;
		doNum2 = Math.random() * 1000;
		
		/*
		 * doNum1 = Math.random() * 1000; doNum2 = Math.random() * 1000;
		 */
		
		System.out.println(doNum1 + doNum2);
		System.out.println(doNum1 - doNum2);
		System.out.println(doNum1 * doNum2);
		System.out.println(doNum1 / doNum2);
		
		
		//tr
		/*
		 * double doNum1 = Math.random();
		 * 
		 * doNum1 * = 1000;
		 * 
		 * Math.random() 이 실행된 결과가 담긴 doNum1 변수의 값에
		 * 1000 을 곱하여 다시 doNum1 에 저장하라
		 * doNum1 = doNum1 * 1000; 과 같다
		 * doNum1 : 0.00 ~ 999.99 범위의 실수가 저장
		 */
		
		doNum1 ++;
		// doNum1 에 담긴 값에 1을 더하여 다시 doNum1 에 저장
		// doNum1 : 1.000 ~ 1000.999 범위의 실수가 저장
		
		// 정수 값으로 변환
		// int intNum1 = (int)doNum1;
		
		/*
		 * doNum1 *= 1000; int intNum1 = (int)doNum1;
		 * 
		 * 
		 * double doNum2 = Math.random() * 1000 + 1; int intNum2 = (int)doNum2;
		 * 
		 * int intSum = intNum1 + intNum2; int intDes = intNum1 - intNum2; int intMulti
		 * = intNum1 * intNum2; int intDiv = intNum1 / intNum2;
		 * 
		 * System.out.println("\t%d + %d = %d\n", intNum1, intNum2, intSum);
		 * 
		 */
	}
}
