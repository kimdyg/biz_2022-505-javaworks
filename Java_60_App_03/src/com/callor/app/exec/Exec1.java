package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {

		int intNum = 0;

		for (int i = 0; i < 10 ; i++) {
			intNum = (int)(Math.random() * 100) + 1;
			if (intNum % 2 == 0) {
				System.out.println(intNum + "짝수");
			} else {
				System.out.println(intNum + "짝수가 아님");
			}
			for(int j = 0 ; j < 10 ; j++) {
				intNum = (int)(Math.random() * 100) +1;
				if(intNum % 3 != 0) {
					System.out.println(intNum +"은/는 2의 배수임");
				} else {
					System.out.println(intNum +"은/는 2의배수가 아님");
					break;
				}
			}
		}

	}
}
