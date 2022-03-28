package com.callor.var;

public class Var_05 {

	public static void main(String[] args) {
		
		int Num1 = 1;
		
		/*
		 * 아래 명령문이 실행되면 앞에서 Num1에 저장된 1이 일단 출력되고
		 * println() 명령이 실행이 끝나면 비로소 Num1++ 가 실행된다
		 */
		System.out.println(Num1++); // 1이 출력된다
		System.out.println(Num1++); // 2이 출력된다
		System.out.println(Num1++); // 3이 출력된다
		
		Num1 = 0;
		System.out.println(Num1); // 0이 출력된다
		
		Num1 += 1;
		System.out.println(Num1); // 1이 출력된다
	}

}
