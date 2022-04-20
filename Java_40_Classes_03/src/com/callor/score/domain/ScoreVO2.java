package com.callor.score.domain;

public class ScoreVO2 /* 생략 되어 있다extends Object*/ {

	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;

	// 빈공간 > 우클릭 > 소스 > 제너레이터 게터 엔 세터
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getIntKor() {
		return intKor;
	}

	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}

	public int getIntEng() {
		return intEng;
	}

	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	public int getIntSum() {
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}

	public float getfAvg() {
		fAvg = (float)getIntSum() / 3.0f;
		return fAvg;
	}

	@Override
	public String toString() {
		return "ScoreVO2 ["
				+ "stName=" + stName 
				+ ", intKor=" + intKor 
				+ ", intEng=" + intEng 
				+ ", intMath=" + intMath
				+ ", intSum=" + getIntSum() 
				+ ", fAvg=" + getfAvg() + "]";
	}

	
}
