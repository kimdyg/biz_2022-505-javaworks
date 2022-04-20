package com.callor.arrays.exec;

public class ExecV3 {

	public static void main(String[] args) {

		int[] intScore = new int[100];
		
		// 짝수의 개수를 세어서 저장할 변수
		int intSum = 0;

		for (int i = 0; i < intScore.length; i++) {
			intScore[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intScore.length; i++) {
			if ((intScore[i] % 2) == 0) {
				intSum++;
			}
		}
		System.out.println("짝수는 총 : " + intSum + "개");

	}
}
