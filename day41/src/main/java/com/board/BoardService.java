package com.board;

import java.time.LocalDate;
import java.util.ArrayList;

public class BoardService {
	private final static BoardService service = new BoardService();
	private BoardService() {
		
	}
	public static BoardService getInstance() {
		return service;
	}
	
	private ArrayList<Board> list = new ArrayList<>();
	private Long bno = 1L;
	
	public void create(String title, String content) {
		Board board = new Board(bno++, title, content, LocalDate.now());
		list.add(board);
	}
	
	public ArrayList<Board> list() {
		return list;
	}
}
