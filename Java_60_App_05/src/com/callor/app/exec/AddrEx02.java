package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class AddrEx02 {

	public static void main(String[] args) {

		AddressVO hong = AddressVO.builder()
						.name("홍길동")
						.addr("광주1")
						.tel("010-1111")
						.age(12)
						.hobby("축구")
						.build();
			
		AddrServiceV1 addService = new AddrServiceV1();
		/*
		 * printAddr() method 는 AddressVO type 의 매개변수를 갖고 있다
		 * 특별히 return type 이 없다
		 */
		addService.printAddr(hong);
	}
}
