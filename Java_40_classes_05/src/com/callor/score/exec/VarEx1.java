package com.callor.score.exec;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {

	public static void main(String[] args) {
		
		// 기본 값을 저장 하는 용도로만 쓰인다
		// primitive(기본) type keyword
		// primitive type 변수 선언
		int num1 = 100;
		float num2 = 100.3f;
		boolean bYes = true;
		
		
		// 여러가지 편리한 기능을 가져다 쓸수 있기 때문에
		// class type keyword
		// class type 변수 선언
		// 참조형 변수 선언
		Integer intNum1 = 100;
		Float fNum2 = 100.3f;
		Boolean bYes1 = true;
		
		String str = "korea";
		StudentVO stVO = new StudentVO();
		
		StudentVO[] stList = new StudentVO[10];
		
		ScoreService scService = new ScoreServiceImplV1();
		
	}
}
