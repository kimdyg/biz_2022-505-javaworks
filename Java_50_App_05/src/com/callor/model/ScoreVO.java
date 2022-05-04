package com.callor.model;

public class ScoreVO {

	private int intNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;

	public ScoreVO() {

	}

	public ScoreVO(int intNum, int intKor, int intEng, int intMath, int intSum, float floatAvg) {
		super();
		this.intNum = intNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
		this.intSum = intSum;
		this.floatAvg = floatAvg;
	}

	public int getIntNum() {
		return intNum;
	}

	public void setIntNum(int intNum) {
		this.intNum = intNum;
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
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getFAvg() {
		return floatAvg;
	}

	public void setFAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}

	@Override
	public String toString() {
		return intNum + "\t" + intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + floatAvg + "";
	}

}