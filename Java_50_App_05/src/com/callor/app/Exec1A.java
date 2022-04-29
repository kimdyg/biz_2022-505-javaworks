package com.callor.app;

public class Exec1A {

	public static void main(String[] args) {
		//25 ~ 50까지 정수 생성하기
		int num = (int)(Math.random() * 25) + 25;
		int pizza= 6;
		/*
		 * 피자가 한판에 6조각
		 * 피자를 부족하지 않도록 먹기위해서
		 * 최소 몇판의 피자가 필요한가
		 * 인원수/ 피자수 로 나누었을때
		 * 그 결과가 0이거나 최소 1 이상이어야 한다.
		 */
				if(num % pizza == 0) {
					System.out.println("학생수 : " + num + "\n피자 개수 : " + (num/pizza));
				} else  {
					System.out.println("학생수 : " + num + "\n피자 갯수 :"   + ((num/pizza)+1) );
				}
		}}
