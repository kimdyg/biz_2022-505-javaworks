package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

public interface StudentService {

	public void loadStudent();
	public List<StudentVO> getStudents();
	public StudentVO findByStNum(String stNum); // 번호는 중복 될 수 없으니 find~
	public List<StudentVO> findByStName(String stName); // 이름은 중복될 수 있으니 리스트 타입
	
	
	
}
