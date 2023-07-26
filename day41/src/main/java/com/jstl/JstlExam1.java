package com.jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl1")
public class JstlExam1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(75);
		list.add(85);
		list.add(95);
		list.add(65);
		
		RequestDispatcher rd = request.getRequestDispatcher("/jstl1.jsp");
		request.setAttribute("list", list);
		rd.forward(request, response);
	}

}
