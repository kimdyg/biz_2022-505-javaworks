package com.callor.arrays.service;

public class ServiceV1A {

	/*
	 * private 으로 선언된 makeScore()는
	 * Servicev1A 클래스 블럭({}) 에서만 접근(호출) 할 수있다
	 * local method(지역 메서드) 라고 한다
	 */
	
	private int makeScore () {
		return (int)(Math.random() * 100) + 1;
	}
	/*
	 * public 으로 선언된 scoreKorSum() 은 이 프로젝트의 어디에서
	 * 클래스의 인스턴스를 생성하고 인스턴스를 통하여 접근(호출) 할 수 있다
	 */
	public int scoreKorSum() {
		
		int intKorK = 0;
		int intKorL = 0;
		int intKorP = 0;
		int intKorG = 0;
		int intKorE = 0;
		/*
		 * V1에서 Math.random() 를 사용하여 점수를 생성하는 코드를
		 * makeScore() 로 이전하고, 점수 생성이 필요한 경우
		 * makeScore() 를 호출하여 결과를 사용한다
		 */
		
		intKorK = makeScore();
		intKorL = makeScore();
		intKorP = makeScore();
		intKorG = makeScore();
		intKorE = makeScore();
		
		int intSum = intKorK;
		intSum += intKorL;
		intSum += intKorP;
		intSum += intKorG;
		intSum += intKorE;
		
		return intSum; 
	}
		
}
