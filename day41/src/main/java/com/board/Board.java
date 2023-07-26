package com.board;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

// EL 에서 ${board.bno} 라고 쓰면 Java 로는 Board.getBno()
// 즉, EL 에서 값을 꺼내려면 반드시 Getter 가 있어야한다.

@AllArgsConstructor
@Getter
@ToString
public class Board {
	private Long bno;
	private String title;
	private String content;
	private LocalDate writeday;
}
