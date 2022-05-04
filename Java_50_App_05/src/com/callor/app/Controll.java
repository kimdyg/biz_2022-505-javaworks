package com.callor.app;

import com.callor.service.ScoreService;

public class Controll {
	public static void main(String[] args) {
		ScoreService score = new ScoreService();
		score.makeScore(20);
		score.scorePrint();
	}
}
