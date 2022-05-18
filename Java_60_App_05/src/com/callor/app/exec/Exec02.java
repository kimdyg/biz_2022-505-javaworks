package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec02 {

	public static void main(String[] args) {
		AddressVO[] addrs = new AddressVO[3];
		
		addrs[0] = new AddressVO();
		addrs[0].setName("홍길동");
		addrs[0].setAge(0);
		
		addrs[1] = AddressVO.builder().name("이몽룡").age(20).build();
		addrs[2] = AddressVO.builder().name("성춘향").age(16).build();
		
		for(AddressVO aVO : addrs) {
			System.out.println(aVO.toString());
			
		}
		int size = addrs.length;
		for(int i = 0 ; i < size ; i++) {
			for(int j = i + 1 ; j < size ; j++) {
				
				// 배열의 i번째 요소인 aVO 의 나이가 더 큰 값이면
				if(addrs[i].getAge() > addrs[i].getAge()) {
					
					// 배열의 i번째 요소를 _tVO 에 임시저장
					// 배열의 i번째  요소를 대피
					AddressVO _tVO = addrs[i];
					
					// i번째 요소위치에 j번째 요소값을 복사
					addrs[i] = addrs[j];
					// 대피해 두었던 i번째 요소 값을 j번째에 복사
					addrs[j] = _tVO;
				}
			}
		}
	}
}
