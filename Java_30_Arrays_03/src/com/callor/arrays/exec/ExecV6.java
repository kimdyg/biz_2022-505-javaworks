package com.callor.arrays.exec;

public class ExecV6 {

	public static void main(String[] args) {

		int[] intScore = new int[100];
		int intCount = 0;
		System.out.println("==================================================================================");
		System.out.println("짝수 리스트");
		System.out.println("=================================================================================");
		for (int i = 0; i < intScore.length; i++) {
			intScore[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intScore.length; i++) {
			if ((intScore[i] % 2) == 0) {
				System.out.print(intScore[i] + ",\t");
				intCount += 1;
				if (intCount % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("\n==================================================================");
	}
}
