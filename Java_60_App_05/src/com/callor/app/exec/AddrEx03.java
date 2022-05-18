package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

import lombok.Builder;

public class AddrEx03 {

	public static void main(String[] args) {
		AddressVO[] addrs = new AddressVO[3];
		addrs[0] = AddressVO.builder()
						.name("홍길동")
						.build();
		
		addrs[1] = new AddressVO();
		addrs[1].setName("이몽룡");
		addrs[1].setTel("010-111-1111");
		addrs[2] = new AddressVO();
		addrs[2].setName("성춘향");
		addrs[2].setTel("010-111-1112");
		
		AddrServiceV1 adService = new AddrServiceV1();
		adService.printAddrList(addrs);
	}
}
