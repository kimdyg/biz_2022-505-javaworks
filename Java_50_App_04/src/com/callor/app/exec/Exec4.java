package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

/*
 * 생성된 리스트에 가장 마지막 값을 저장
 * 저장만 하면됨
 * 리스트를 여러개 만들어서 하려면
 * 리스트를 만들어놓고 n번째 혹은 첫번째 마지막번째 리스트 값을 알 수 있는지
 * 100개의 리스트를 만들고 55이상의 정수중 22번째 위치(리스트)에 해당하는 값
 * 
 */
public class Exec4 {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			int num = (int) (Math.random() * 100) + 1;
			nums.add(num);

		}
		
		int lastIndex = 0;
		int lastValue = 0;
		int size = nums.size();
		for(int i = 0 ; i < size ; i++) {
			int num = nums.get(i);
			if(num >= 55) {
				lastIndex = i;
				lastValue = num;
			}
		}
		System.out.printf("%3d 번째 %3d", lastIndex, lastValue);
		
		lastIndex = 0;
		for(int i = 0 ; i < size ; i++) {
			int num = nums.get(i);
			if(num >=55) {
				lastIndex = i;
			}
		}
		System.out.printf("%3d 번째 %3d", lastIndex,nums.get(lastIndex));
		
		// for() index 를 역순으로 진행하기
		for(int i = size -1 ; i > -1 ; i--) {
			if(nums.get(i) >= 55) {
				System.out.printf("%3d 번째 %3d", i, nums.get(i));
				break;
			}
		}
		}
			
}
