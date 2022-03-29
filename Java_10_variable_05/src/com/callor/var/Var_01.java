package com.callor.var;

public class Var_01 {
	public static void main(String[] args) {
		
		double dounum1 = Math.random() * 1000;
		double dounum2 = Math.random() * 1000;
		
		double Sum = dounum1 + dounum2;
		double Minus = dounum1 - dounum2;
		double Multipule = dounum1 * dounum2;
		double Division = dounum1 / dounum2;
		
		System.out.println(Sum);
		System.out.println(Minus);
		System.out.println(Multipule);
		System.out.println(Division);
		
		/*
		// 선생님
		// 실수(double) 형으로 선언을 할 경우 0보다는 0.0 처럼
		// 명확하게 표현하는 것이 좋다.
			double doNum1 = 0.0;
			double doNum2 = 0.0;
			
			doNum1 = Math.random() * 1000;
			doNum2 = Math.random() * 1000;
			
				System.out.println(doNum1);
				System.out.println(doNum2);
				
				System.out.println(doNum1 + doNum2);
				System.out.println(doNum1 - doNum2);
				System.out.println(doNum1 * doNum2);
				System.out.println(doNum1 / doNum2);
		*/
	}

}
