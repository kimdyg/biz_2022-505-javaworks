package com.callor.app.controller;

import com.callor.app.service.impl.ScoreServiceImplV1;

public class ControllerV1 {

	public static void main(String[] args) {
		
		ScoreServiceImplV1 ssImpl = new ScoreServiceImplV1();
		ssImpl.makeScore();
		
	}
}