package com.jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl3")
public class JstlExam3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Board> list = new ArrayList<>();
		list.add(new Board(5L, "5번글", "spring", "2023-07-18", 15L));
		list.add(new Board(4L, "4번글", "summer", "2023-07-18", 18L));
		list.add(new Board(3L, "3번글", "spring", "2023-07-18", 72L));
		list.add(new Board(2L, "2번글", "winter", "2023-07-18", 23L));
		list.add(new Board(1L, "1번글", "spring", "2023-07-18", 5L));
		
		RequestDispatcher rd = request.getRequestDispatcher("/jstl3.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}

}
