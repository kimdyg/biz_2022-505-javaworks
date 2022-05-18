package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec04 {

	public static void main(String[] args) {
		
		List<BookVO> bookList = new ArrayList<>();
		// 1개의 bookVO 를 만들고
		BookVO bookVO = new BookVO();
		for(int i = 0 ; i < 10; i++) {
			String title = ((int)(Math.random() + 1000) + 100) + "";
			bookVO.setTitle(title);
			// 같은 bookVO 를 list 에 10번 추가하기
			// 모든 list 의 주소를
			bookList.add(bookVO);
		}
		for(BookVO vo : bookList) {
		System.out.println(vo.toString());
	}
}
}
