package com.callor.app.exec;

public class Exec2 {

	/*
	 * 정수형 배열을 생성하고 각 요소에1 ~ 100 까지 임의 정수를 생성하여 저장하고 배열에 저장된 요소의 값을 모두 합산하여 출력
	 */
	public static void main(String[] args) {
		int[] intNum1 = new int[10];
		for (int i = 0; i < intNum1.length; i++) {
			int num = (int)(Math.random() * 100) + 1;
			intNum1[i] = num;
		}
		int intSum = 0;
		/*
		 * int intSum = 0; 
		 * for(int i : itntNum1) { 
		 * intSum += i; 
		 * } 
		 * System.out.println("총합계: " + intSum);
		 */
		for (int i = 0; i < intNum1.length; i++) {
			intSum += intNum1[i];
		}
		System.out.println(intSum);
	}

}
