package com.callor.score.service.impl;

import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	protected String studentFile;
	
	public ScoreServiceImplV1() {
		
	}
	public ScoreServiceImplV1(String studentFile) {
		this.studentFile = studentFile;
		
	}
	
	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int retSum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float retAvg() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "ScoreServiceImplV1 [studentFile=" + studentFile + "]";
	}

	
}
