package com.callor.score.service;

import com.callor.score.domain.ScoreVO2;
import com.callor.score.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1{
	
	public ScoreServiceV2() {
		this(10);
	}
	
	public ScoreServiceV2 (int length) {
		scores = new ScoreVO2[length];
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreVO2();
		}
	}
	
	// 학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV2(String[] stNames) {
		
		int length = stNames.length;
		scores = new ScoreVO2[length];
		for( int i = 0 ; i < length ; i++) {
			scores[i] = new ScoreVO2();
			scores[i].setStName( stNames[i]);
		}
			
	}
	public void printScore() {
		
		int KorTotal = 0;
		int EngTotal = 0;
		int MathTotal = 0;
		int SumTotal = 0;
		float AvgResult = 0;
		System.out.println(Line.dLine(50));
		System.out.println("빛나고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(50));
		
		for(int i = 0 ; i < scores.length ; i++) {
			System.out.printf("%-3s\t",scores[i].getStName());
			System.out.printf("%4d\t",scores[i].getIntKor());
			System.out.printf("%4d\t",scores[i].getIntEng());
			System.out.printf("%4d\t",scores[i].getIntMath());
			System.out.printf("%6d\t",scores[i].getIntSum());
			System.out.printf("%4.2f\n",scores[i].getfAvg());
			
			KorTotal += scores[i].getIntKor();
			EngTotal += scores[i].getIntEng();
			MathTotal += scores[i].getIntMath();
			SumTotal += scores[i].getIntSum();
			/*
			 * 평균계산 주의
			 */
			AvgResult += scores[i].getfAvg();
		}
		System.out.println(Line.sLine(50));
		System.out.printf("%-3s\t", "총점");
		System.out.printf("%4d\t",KorTotal);
		System.out.printf("%4d\t",EngTotal);
		System.out.printf("%4d\t",MathTotal);
		System.out.printf("%6d\t",SumTotal);
		System.out.printf("%4.2f\n",AvgResult / scores.length);
		System.out.println(Line.sLine(50));
		
	}
}
