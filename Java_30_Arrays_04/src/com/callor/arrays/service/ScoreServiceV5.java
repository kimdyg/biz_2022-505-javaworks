package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * prinScore()
 * sumScore()
 * 등의 method 를 선언하고
 * 
 * 임의 성적을 생성하여 intKor에 저장
 * 성적일람표 출력
 * 총점계산
 */
public class ScoreServiceV5 {

	private int[] intKor;

	public ScoreServiceV5(int length) {
		intKor = new int[length];

	}

	public void makeScore() {
		for (int i = 0; i < intKor.length; i++) {
			intKor[i] = (int) (Math.random() * 49) + 51;
		}
	}

	public void printScore() {
		System.out.println(Line.dLine);
		System.out.println("성적 일람표");
		System.out.println(Line.sLine);
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t", intKor[i]);
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
	}
	int intSum = 0;
	
	public void sumScore() {
		for (int i = 0; i < intKor.length; i++) {
			intSum += (intKor[i]+1);

		}
		System.out.println("총점 : " + intSum);
	}
}
