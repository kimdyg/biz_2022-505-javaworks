package com.callor.app.exec;

public class Exec7 {

	public static void main(String[] args) {
		int[] intNum = new int[10];
		for (int i = 0  ; i < intNum.length; i++) {
			int num = (int)(Math.random() * 100) + 2;
			intNum[i] = num;
			
		int count = 0;
		boolean pFlag = true;
		for(int j = 2 ; j < num ; j++) {
			
			if (num % 1 == 0) {
				pFlag = !pFlag;
				count++;
				
			}
			System.out.println(count);
			if(pFlag) {
				System.out.println(num + " 소수 이다");
			} else {
				System.out.println(num + "소수가 아니다");
			}
		} 
	}
}
}
