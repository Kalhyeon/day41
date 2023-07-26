package com.static_example;

import java.time.LocalDate;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class 대출 {
	private Long 대출번호;
	private String 이름;
	private Long 금액;
	private LocalDate 대출일;
	
//	금리는 기본 금리 + 우대 금리
//	기본 금리는 4%, 우대 금리는 사람마다 다르다.
	public final static Double 기본금리 = 0.04;
//	final 은 상수이므로 초기화가 필수, 단 생성자에서 초기화할 수 있다.
	public final Double 우대금리;
}
