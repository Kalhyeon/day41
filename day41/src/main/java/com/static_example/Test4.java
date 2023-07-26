package com.static_example;

class Sample4 {
	Long generalValue = 10L;		// 10개
	static Long staticValue = 20L;	// 1개
	
	public void generalMethod() {
//		10개
//		일반 멤버는 모든 멤버에 접근할 수 있다.
		System.out.println(generalValue);
		System.out.println(staticValue);
	}
	
	public static void staticMethod() {
//		1개
//		정적 멤버는 정적 멤버에만 접근할 수 있다.
//		System.out.println(generalValue);
		System.out.println(staticValue);
	}
}

public class Test4 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			new Sample4();
		}
	}
}
