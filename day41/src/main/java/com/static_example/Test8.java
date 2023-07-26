package com.static_example;

import lombok.AllArgsConstructor;

class SampleService {
	private final static SampleService service = new SampleService();
	
	private SampleService() {
		
	}
	
	public static SampleService getInstance() {
		return service;
	}
}

@AllArgsConstructor
class 고정금리대출 {
//	대출 받을 때 정해지고 변경할 수 없다.
//	final 은 생성자에서 초기화가 가능한 상수이다
//	=> 객체마다 값이 다른 상수이다.
	final double 금리;
}

public class Test8 {
	public static void main(String[] args) {
//		final : 변경 금지 => 상수 => 객체마다 값이 다른 상수
		고정금리대출 대출1 = new 고정금리대출(0.045);
		고정금리대출 대출2 = new 고정금리대출(0.038);
		고정금리대출 대출3 = new 고정금리대출(0.054);
		
//		final : 객체마다 가지는 상수 (생성자에서 초기화)
//		static : 객체들이 공유하는 값 (인스턴스 초기화)
//		final static 또는 static final : 객체들이 공유하는 상수
//									   (인스턴스 초기화)
	}
}
