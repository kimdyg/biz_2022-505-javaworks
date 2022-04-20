package com.callor.score.exec;

import com.callor.score.domain.ScoreVO2;

public class ExecV2 {

	public static void main(String[] args) {
		
		ScoreVO2 stNo1 = new ScoreVO2();
		
		stNo1.setStName("홍길동");
		System.out.println(stNo1.getStName());
		
		
		ScoreVO2 stNo2 = new ScoreVO2();
		
		stNo2.setStName("성춘향");
		System.out.println(stNo2.getStName());
		
		stNo1.setIntKor(90);
		stNo2.setIntKor(100);
		
		stNo1.setIntEng(80);
		stNo2.setIntEng(95);
		
		stNo1.setIntMath(70);
		stNo2.setIntMath(70);
		
		System.out.println(stNo1.toString());
		System.out.println(stNo2.toString());
	}
}
