package com.callor.arrays.service;

public class ServiceV1 {
	public int scoreKorSum() {
		
		int intKorK = 0;
		int intKorL = 0;
		int intKorP = 0;
		int intKorG = 0;
		int intKorE = 0;
		
		intKorK = (int)(Math.random() * 100) + 1;
		intKorL = (int)(Math.random() * 100) + 1;
		intKorP = (int)(Math.random() * 100) + 1;
		intKorG = (int)(Math.random() * 100) + 1;
		intKorE = (int)(Math.random() * 100) + 1;
		
		int intSum = intKorK;
		intSum += intKorL;
		intSum += intKorP;
		intSum += intKorG;
		intSum += intKorE;
		
		return intSum; 
	}
		
}
