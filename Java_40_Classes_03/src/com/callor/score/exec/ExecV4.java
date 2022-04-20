package com.callor.score.exec;

import com.callor.score.domain.ScoreVO2;

public class ExecV4 {

	public static void main(String[] args) {
		
		// ScoreVO2 클래스를 사용하여 100개의 배열 객체 선언
		ScoreVO2[] scores = new ScoreVO2[100];
		
		// 배열개체 모든 요소를 for () 반복문 내에서
		// 생성자를 호출하여 초기화
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO2();
		}
	}
}
