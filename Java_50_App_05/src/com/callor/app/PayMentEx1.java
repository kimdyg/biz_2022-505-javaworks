package com.callor.app;

public class PayMentEx1 {

	/*
	 * 급여를 현금으로 지급하려고 한다 대한민국 액
	 * 면가를 기준으로 최소 화폐매수로 지급하려고 한다
	 * 급여금액에 따라 최소 화폐매수 계산을 수행하기
	 */
	public static void main(String[] args) {

		int pay = 3_928_880;
		
		int paper = (pay/ 50_000);
		System.out.println("5만원권 : " + paper);
		pay -= paper * 50000; // 5만원권을 제외한 금액
		
		paper = (pay / 10_000);
		System.out.println("1만원권 : " + paper);
	}
}
