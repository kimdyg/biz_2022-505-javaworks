package com.callor.arrays;

public class ArraysV5_5 {

	public static void main(String[] args) {
		
		int[] intScore = new int[100];
//		for(index=0; index < 100; index++) {
//			intScore[index] = (int)(Math.random() * 100) +1;}
//			System.out.printf("\t%d, %d, %d, %d, %d\n", intScore[index], intScore[index], intScore[index], intScore[index], intScore[index]);
//			System.out.printf("\t%d\n,", intScore[index],"%d,", intScore[index],"%d,", intScore[index],"%d,", intScore[index],"%d,", intScore[index]);
//		}
//		for(int i=0; i < intScore.length ; i++) {
//			System.out.printf( intScore[i] + ",\t");
		for (int index=0; index < intScore.length; index++) {
			intScore[index] = (int)(Math.random() * 100) +1;
			System.out.printf("\t%d,", intScore[index]);
			if((index+1) % 5 ==0) {
				System.out.println();
			}
		}
		
	}
}
