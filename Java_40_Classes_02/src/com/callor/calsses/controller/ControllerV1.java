package com.callor.calsses.controller;

import com.callor.calsses.service.ScoreServiceV1;

public class ControllerV1 {

	public static void main(String[] args) {
		ScoreServiceV1 scServiceV1 = new ScoreServiceV1(3);
		int intResult = scServiceV1.input();
		if(intResult < 0) {
			System.out.println("입력 도중 중단함");
		} else {
			System.out.println("입력을 모두 마침");
		}
	}
}
