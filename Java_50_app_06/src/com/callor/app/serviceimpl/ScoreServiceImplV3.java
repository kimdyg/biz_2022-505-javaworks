package com.callor.app.serviceimpl;

import com.callor.app.model.ScoreVO;
import com.callor.app.utils.Line;

/*
 * V2 클래스를 상속받는 순간
 * makeScore(), printScore() method 를 기본으로 사용할 수 있다.
 */
public class ScoreServiceImplV3 extends ScoreServiceImplV2{
	
	public ScoreServiceImplV3() {
		/*
		 * super() method
		 * 상속받은(V2) 클래스의 기본생성자를 호출하여
		 * protected 로 선언된 변수들을 초기화 하기
		 */
		super();
	}
	@Override
	public void printScore() {
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("한국고교 성적일람표");
		System.out.println(Line.sLine(lineLength));
		for(String sub : subs) {
		System.out.println(sub + "\t");
	}
		System.out.println();
		System.out.println(Line.sLine(lineLength));
		
		for(ScoreVO scVO : scList) {
			System.out.println( scVO.toString());
		}
	}

}
