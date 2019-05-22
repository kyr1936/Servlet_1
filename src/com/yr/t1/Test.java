package com.yr.t1;

import java.util.Random;

public class Test {

	// 멤버변수 선언
	// 생성자 선언
	// 멤버메서드 선언
	// 0~10 미만 사이의 정수를 랜덤하게 하나를 리턴하는 메서드
	// 메서드멍 getNum
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]) {}
	
	public int getNum() {
		
		Random random = new Random();
		int result = random.nextInt(10); 
		
		return result;
	}
	
}
