<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--
		JSP 는 HTML 과 자바를 함께 작성하기위해 만들어졌다
		=> 퍼블리셔까지 자바가 하겠지?
		=> 그러나 완벽하게 망했다.
	-->
	<%
		ArrayList<Integer> list = (ArrayList)request.getAttribute("list");
		out.print(list);
	%>
	<!-- JSP 는 데이터 출력용으로 사용하자 : EL (Expression Language) -->
	${list}<br>
	${3==0}<br>
	${3==3}<br>
	<!-- EL 은 for 문, if 문이 없다. 그래서 만들어진 것이 JSTL 이다. -->
	<!--
		JSP 는 자바의 뷰 기술로 아주 옛 기술이다.
		그래서 스프링은 JSP 를 매우 싫어한다.
		그렇다고 쉽게 죽지는 않는다.
	-->
</body>
</html>