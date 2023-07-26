package com.static_example;

public class Test5 {
	public static void main(String[] args) {
//		객체마다 가지고 있는 정보가 다르다.
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		
//		메서드로 출력되는 결과도 다르다
//		=> 메서드마다 실행의 결과가 다르다.
		System.out.println(a.intValue());
		System.out.println(b.intValue());
		
//		항상 결과가 동일하다면 객체를 생성하지 않는 편이 좋다.
//		수학 함수들의 집합인 Math 클래스는
//		모든 메서드가 static 이다.
		System.out.println(Math.floor(3.14));
		
//		main 은 왜 static 인가
//		- main 은 프로그램의 시작이다.
//		- 클래스의 객체를 만들려면 main 이 시작돼야 한다.
//		- 그런데 main 은 클래스의 멤버이므로
//		  클래스의 객체가 있어야 main 의 실행이 가능하다.
//		- main 은 static 이므로 클래스의 객체가 없어도
//		  클래스.main() 으로 실행한다.
	}
}
