package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

//		String strName =""
		int intRan = (int) (Math.random() * 100) + 1;

		if (intRan % 2 == 0) {
			System.out.println("짝수인 값 = " + intRan);
		} else {
			System.out.println("짝수가 아닌 값 = " + intRan);

			boolean bEven = false;
			// intRan 변수를 2로 나눈 나머지가 0 이냐?
			// intRan 변수에 담긴 값을 2로 나눈 나머지가 0 이냐?
			// 0이면 true 가 bEven 에 저장, 아니면 false 가 bEven 저장된다
			bEven =(intRan % 2) == 0;
			if(bEven) {
				System.out.println(intRan + "짝수");
			} else {
				System.out.println(intRan + "짝수가 아님");
				
			}
		}
	}
}
