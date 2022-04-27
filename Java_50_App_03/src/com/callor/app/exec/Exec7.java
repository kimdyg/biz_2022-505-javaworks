package com.callor.app.exec;

public class Exec7 {

	public static void main(String[] args) {
		int[] intNum = new int[10];
		for (int i = 0  ; i < intNum.length; i++) {
			int num = (int)(Math.random() * 100) + 1;
			intNum[i] = num;
			
		int count = 0;
		for(int j = 2 ; j < num ; j++) {
			if ((intNum[j] % 1) == 0) {
				count++;
			}
			if(intNum[j]) {
				System.out.println(num + " 소수 이다");
			} else {
				System.out.println(num + "소수가 아니다");
			}
			System.out.println(count);
		}
	}
}
}
