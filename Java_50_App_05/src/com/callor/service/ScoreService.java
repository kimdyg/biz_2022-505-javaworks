package com.callor.service;

import com.callor.model.ScoreVO;

public class ScoreService {
public static void main(String[] args) {
	
	ScoreVO sVO = new ScoreVO();
	int intScore = sVO.makeScore();
	System.out.println("================================================");
	System.out.println("학번\t 국어\t 영어\t 수학\t 총점\t 평균");
	System.out.println("------------------------------------------------");
	
	System.out.println("================================================");
}
}
