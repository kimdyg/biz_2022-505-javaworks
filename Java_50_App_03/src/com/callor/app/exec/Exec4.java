package com.callor.app.exec;

public class Exec4 {

	/*
	 *  1 ~ 100 까지 임의 수를 생성하고
	 *  그 수가 소수(prime number)인지 판별하라
	 */
	/*
	 * public static void main(String[] args) { int num = (int)(Math.random() * 100)
	 * + 1;
	 * 
	 * 
	 * if(num == 1) { System.out.printf("%d = 소수 다", num); } else if (num == 2) {
	 * System.out.printf("%d = 소수 다", num); } else if (num == 3) {
	 * System.out.printf("%d = 소수 다", num); } else if (num == 5) {
	 * System.out.printf("%d = 소수 다", num); } else if (num == 7) {
	 * System.out.printf("%d = 소수 다", num); } else if(num % 2 == 0) {
	 * System.out.printf("%d = 소수 아니다", num); } else if (num % 3 == 0) {
	 * System.out.printf("%d = 소수 아니다", num); } else if (num % 5 == 0) {
	 * System.out.printf("%d = 소수 아니다", num); } else if (num % 7 == 0) {
	 * System.out.printf("%d = 소수 아니다", num); } else {
	 * System.out.printf("%d = 소수 다", num); } }
	 */

	public static void main(String[] args) {
		
		int num = (int)(Math.random() * 100) + 2;
		
		boolean pFlag = true;
		int count = 0;
		for(int i = 2 ; i < num ; i++) {
			
			if(num % 1 ==0) {
				pFlag = !pFlag;
				count++;
				break;
			}
		}
		/*
		 * 만약 num 값이 소수인 경우 for() 반복문이 모두 완료되고 종료된다
		 * 그러면 pFlag 는 처음 설정한 값이 변함이 없기 때문에 true 이다
		 * 
		 * 만약 num 값이 소수가 아닌 경우 중간의 if() {} 코드가 실행되어
		 * pFlag 가 반전되고(즉 false 가 되고) 다음의 if 조건을 만족하지 않아
		 * else {} 코드가 실행된다
		 */
		if(pFlag) {
			System.out.println(num + " 소수 이다");
			System.out.println(count);
		} else {
			System.out.println(num + "소수가 아니다");
		}
	}
	}
