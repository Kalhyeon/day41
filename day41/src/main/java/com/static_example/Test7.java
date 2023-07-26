package com.static_example;

// 프로그래밍 중 자주 발생하는 문제에 대해
// 이런 문제가 발생하면 이렇게 대응하라 : 디자인 패턴
// BoardService 는 모든 메서드가 static
// 1. 작업하는 여러 서블릿들이 데이터 저장 객체를 공유해야 한다.
// 2. static 을 사용하면 new 키워드를 사용하지 않고
//	  메서드를 공유할 수 있다.
// 3. 객체 지향 프로그래밍에서 객체를 만들지 않고
//    작업하는 것이 바람직한가
//    => 객체를 하나만 만들어서 빌려 사용하자
//	  => 싱글톤 패턴
// 싱글톤 (Singleton) 패턴
class BoardService {
//	객체가 1개만 존재 => 스스로 객체를 생성, 외부 생성 금지
//	1. 자식의 static 필드를 가진다.
//	2. 생성자는 private 이다.
//	3. 객체를 빌려주는 getInstance() 메서드를 작성한다.
	private final static BoardService service = new BoardService();
	
	private BoardService() {
		
	}
	
	public static BoardService getInstance() {
		return service;
	}
}

public class Test7 {
	public static void main(String[] args) {
//		BoardService service = new BoardService();
//		=> 생성자가 보이지 않는다 => 에러
		BoardService service1 = BoardService.getInstance();
		BoardService service2 = BoardService.getInstance();
		System.out.println(service1.hashCode());
		System.out.println(service2.hashCode());
		// 두 객체는 같다.
	}
}

/*
 * static : 객체가 아닌 클래스에 소속되어 공유된다 + 객체 없이 사용이 가능하다.
 * static 은 static 끼리만 접근이 가능하다.
 * 
 * 값을 저장하는 VO 객체는 여러개가 필요하다.
 * 값을 처리하는 Service 객체는 하나만 있으면 된다.
 * Service 객체
 * 1. 모든 메서드를 static 으로 하여 객체 없이 사용한다.
 * 2. Singleton 으로 하나의 객체만 생성한다.
 */