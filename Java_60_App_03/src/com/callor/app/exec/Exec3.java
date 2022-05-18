package com.callor.app.exec;

public class Exec3 {

	public static void main(String[] args) {
		int[] intNum = new int[10];
		int intSum;
		intSum =0;
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < intNum.length; i++) {
			System.out.println(intNum[i]);
			
		}
		float Avg =0;
		for (int i = 0; i < 10; i++) {
			intSum += intNum[i];
			Avg = intSum;
			Avg /= intNum.length;
		}
		System.out.println("더한 값"+intSum);
		System.out.printf("평균 : %3.2f\n",(float)(intSum/10));
		System.out.printf("평균 : %3.2f\n", Avg);
	
		/*
		 * 총점을 구하는 연산이 없다면
		 * 평균을 구할때 먼저 총점을 구하고
		 * 계산된 총점으로 나누어 평균을 구하는것이 좋다
		 * 
		 * 각 항목의 평균을 구하여 누적덧셈을 하는것은
		 * 연산오차를 일으킬 수 있다
		 */
		
	}
}
