package com.callor.calsses.controller;

import com.callor.calsses.service.ScoreServiceV3;

public class ControllerV3 {

	public static void main(String[] args) {
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3();
		scServiceV3 = new ScoreServiceV3(20);
		
		// String[] strNames = new String[5];
		// strNames[0] = "홍길"
		// strNames[1] = "이몽"
		// strNames[2] = "성춘"
		// strNames[3] = "임정"
		// strNames[4] = "장보"
		String[] strNames = { "홍길", "이몽", "성충", "임정", "장보"
		};

		scServiceV3 = new ScoreServiceV3(strNames);
	}
}
