package com.static_example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Marine3 {
	private String name;
	public final static Long hp = 40L;
	// 5, 업그레이드 세 번 가능
	private static Long atk = 5L;
	// 0, 업그레이드 한 번 가능
	private static Long dfs = 0L;
}

public class Test3 {
	public static void main(String[] args) {
//		static 은 객체에 소속되어 있지 않다.
//		클래스 소속으로, 객체가 없어도 사용할 수 있다.
		System.out.println(Marine3.hp);
	}
}
