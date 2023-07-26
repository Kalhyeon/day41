package com.static_example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Marine1 {
	private String name;
	private Long hp;
}

@AllArgsConstructor
class Marine2 {
	private String name;
//	final : 변경 금지
//	final static : 공유된 상수 => 관리할 필요가 없다.
	final static Long hp = 40L;
}

public class Test2 {
	public static void main(String[] args) {
		Marine1 m1 = new Marine1("홍길동", 40L);
		Marine1 m2 = new Marine1("전우치", 40L);
//		모든 Marine 의 체력이 같다면, 굳이 Marine 마다
//		체력을 가질 필요가 없다.
		
		Marine2 m3 = new Marine2("홍길동");
		Marine2 m4 = new Marine2("전우치");
//		Marine 의 체력은 공유된다.
//		이는 객체 소속이 아닌 클래스 소속이다.
	}
}
