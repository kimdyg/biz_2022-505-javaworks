package com.callor.arrays.exec;

public class ExecV4 {

	public static void main(String[] args) {

		int[] intScore = new int[100];
		
		// 짝수인 수를 덧셈할 변수를 선언
		int intSum = 0;

		for (int i = 0; i < intScore.length; i++) {
			intScore[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intScore.length; i++) {
			
			/*
			 * boolean bEven = intScore[1] % 2 == 0; 
			 * if(bEven) {
			 * (// 아래 식 intSum = intSum + intScore[1])
			 * 	intSum += intScore[1];
			 * }
			 * */
			
			
			if ((intScore[i] % 2) == 0) {
				intSum += intScore[1];
			}
		}
		System.out.println("짝수의 합 :  "+ intSum);
	}
}
