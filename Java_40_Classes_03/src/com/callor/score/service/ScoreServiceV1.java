package com.callor.score.service;

import com.callor.score.domain.ScoreVO2;
import com.callor.score.utils.Line;

public class ScoreServiceV1 {

	protected ScoreVO2[] scores;
	
	public ScoreServiceV1() {
		this(10);
	}
	
	public ScoreServiceV1 (int length) {
		scores = new ScoreVO2[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO2();
		}
	}
	
	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {
		
		int length = stNames.length;
		scores = new ScoreVO2[length];
		for( int i = 0 ; i < length ; i++) {
			scores[i] = new ScoreVO2();
			scores[i].setStName( stNames[i]);
		}
			
	}
	
	public void makeScore() {
		
		for(int i = 0 ; i < scores.length ; i++) {
			int intKor = (int)(Math.random() * 50) + 51;
			int intEng = (int)(Math.random() * 50) + 51;
			int intMath = (int)(Math.random() * 50) + 51;
			
			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}
		
	}
	int intKorSum = 0;
	int intEngSum = 0;
	int intMathSum = 0;
	int intintSum = 0;
	int intfAvgSum = 0;
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n",scores[i].getfAvg());
			intKorSum +=  scores[i].getIntKor();
			intEngSum +=  scores[i].getIntEng();
			intMathSum +=  scores[i].getIntMath();
			intintSum +=  scores[i].getIntSum();
			intfAvgSum +=  scores[i].getfAvg();
		}
		
		System.out.println(Line.sLine(50));
		System.out.printf("\t%d\t%d\t%d\t%d\t%d", intKorSum, intEngSum, intMathSum, intintSum, (intfAvgSum / 5));
	}
}
