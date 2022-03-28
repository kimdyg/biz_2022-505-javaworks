package com.callor.var;

public class Var_06 {

	public static void main(String[] args) {
		
		int Num1 = 0;
		
		/*
		 * 변수 ++ 또는 ++변수는
		 * 단독으로 사용될때는 연산결과가 똑같다
		 */
		++Num1;
		Num1++;
		
		/*
		 * 하지만 다른 명령문 앞에서 사용될대는
		 * 성질이 매우 달라서 많이 주의를 해야 한다.
		 * ++변수 : 가장먼저 실행되는 명령이 된다.
		 * 변수++ : 모든 명령이 다 실행되고 다음줄 명령문으로 진행하기 직전에
		 * 		실행된다
		 */
		System.out.println(++Num1); // 명령문 앞에 있으면 먼저 시행됨 ++ --
		System.out.println(Num1++); // 명령문 뒤에 있으면 가장 늦게 시행됨 ++ --
		
		Num1 = 0;
		Num1 = ++Num1 * 3;
		System.out.println(Num1);
		Num1 = 0;
		Num1 = Num1++ * 3;
		System.out.println(Num1);
	}

}
