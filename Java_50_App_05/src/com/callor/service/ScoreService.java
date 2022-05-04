package com.callor.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.model.ScoreVO;

public class ScoreService {
	public final List<ScoreVO> scScore = new ArrayList<ScoreVO>();

	public void makeScore(int length) {
		ScoreVO scVO = new ScoreVO();
		for (int i = 0; i < length; i++) {
			scVO = new ScoreVO();
			int intKor = (int) (Math.random() * 50) + 50;
			int intEng = (int) (Math.random() * 50) + 50;
			int intMath = (int) (Math.random() * 50) + 50;
			int intSum = intKor + intEng + intMath;
			float floatAvg = intSum / 3;
			scVO.setIntNum(i + 1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			scVO.setIntSum(intSum);
			scVO.setFAvg(floatAvg);
			scScore.add(scVO);
		}

	}

	int intKorSum = 0;
	int intEngSum = 0;
	int intMathSum = 0;
	int intintSum = 0;
	int intfAvgSum = 0;
	public void scorePrint() {

		System.out.println("================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < scScore.size(); i++) {
			System.out.println(scScore.get(i));
			intKorSum += scScore.get(i).getIntKor();
			intEngSum += scScore.get(i).getIntEng();
			intMathSum += scScore.get(i).getIntMath();
			intintSum += scScore.get(i).getIntSum();
			intfAvgSum += scScore.get(i).getFAvg();

		}
		System.out.println("================================================");
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d", intKorSum, intEngSum, intMathSum, intintSum,(intfAvgSum/20));

	}

}
