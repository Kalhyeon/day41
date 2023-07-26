package com.jstl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Board {
	private Long bno;
	private String title;
	private String writer;
	private String writeday;
	private Long readcnt;
}
