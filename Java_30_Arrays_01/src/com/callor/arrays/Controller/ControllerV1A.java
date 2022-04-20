package com.callor.arrays.Controller;

import com.callor.arrays.service.ServiceV1;
import com.callor.arrays.service.ServiceV1A;

public class ControllerV1A {

	public static void main(String[] args) {
		ServiceV1 serviceV1 = new ServiceV1();
		int intSum = serviceV1.scoreKorSum();
		
		ServiceV1A serviceV1A = new ServiceV1A();
		intSum = serviceV1A.scoreKorSum();
		System.out.println("1학년 3반 국어점수 합산 = " + intSum);
	}
}
