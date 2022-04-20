package com.callor.arrays.exec;

public class ExecV2 {

	public static void main(String[] args) {

		int[] intScore = new int[100];
		// for() 명령문의 선언부에서 변수를 선언하면
		// for() {} 이 끝날때 변수가 소멸된다
		// 같은 method 내에서 같은 이름의 변수를 계속 사용할 수 있다.
		for (int i = 0; i < intScore.length; i++) {
			intScore[i] = (int)(Math.random() * 100) + 1;

		}

		for (int i = 0; i < intScore.length; i++) {
			if (intScore[i] % 2 == 0) {
				System.out.println("짝수 = " + intScore[i]);
			} else {
				System.out.println("짝수가 아님 = " + intScore[i]);
			}
		}
		/*
		 * for (int i = 0; i < intScore.length; i++) {
		 * 	boolean bEven = (intRan[i] % 2) == 0;
		 * 		if(bEven) {
		 * 			System.out.println("짝수 = " + intScore[i]);
		 * 		} else {
		 * 			System.out.println("짝수 아님 = " + intScore[i]);
		 * 		}
		 * }
		 */

	}
}
