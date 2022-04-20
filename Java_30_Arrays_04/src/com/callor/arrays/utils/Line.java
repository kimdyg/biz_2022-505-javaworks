package com.callor.arrays.utils;

public class Line {

	/*
	 * 클래스 영역에 dLine, sLine 문자열형 변수를 선언
	 * static : 프로젝트 코드가 실행 되는 순간 항상 
	 * 		자동으로 사용할 준비가 되도록 선언하는 키워드
	 */
	public static final String dLine = "=".repeat(100);
	public static final String sLine = "=".repeat(100);
	
	// return type이 문자열형(String 형, String type) 인
	// dLine method 선언
	public static String dLine(int count) {
		String dLine = "=";
		return dLine.repeat(count);
	}
	/*
	 * int type(정수 형) argument가 1개 있고
	 * return type이 String type(문자열 형) 인 sLine method 선언
	 */
	public static String sLine(int count) {
		String sLine = "=";
		return sLine.repeat(count);
	}
}
