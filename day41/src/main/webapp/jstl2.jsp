<!-- JSTL 을 사용할 것이다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		JSTL : Java Standard Tag Library
		태그 라이브러리는 HTML 태그와 비슷한 방식으로
		자바의 함수를 사용할 수 있는 기술이다.
	-->
	<h1>if 문 : JSTL if 문은 참일 때 ~하라 만 있고, else 가 없다.</h1>
	<c:if test="${5>3}"> <!-- 조건이 참이라면 -->
		<div>5가 3보다 큽니다.</div> <!-- div 를 출력하라 -->
	</c:if> <!-- 출력하고 개발자 도구로 확인하면 JSTL 은 보이지 않는다. -->
	<c:if test="${3>5}">
		<div>3이 5보다 큽니다.</div>
	</c:if>
	
	<h1>if 문에 해당하는 표현은 choose 문</h1>
	<c:choose>
		<c:when test="${5>3}">
			<div>5가 3보다 큽니다.</div>
		</c:when>
		<c:when test="${3>5}">
			<div>3이 5보다 큽니다.</div>
		</c:when>
		<c:otherwise>
			<div>두 수는 같습니다.</div>
		</c:otherwise>
	</c:choose>
	
	<h1>
		for 문 : items 에 지정한 집합에서 원소를 하나씩 꺼내어
		var 에 담는다.
	</h1>
	<P>EL 은 값을 꺼낼 수만 있다.</P>
	<p>for(Integer num:list)</p>
	<c:forEach items="${list}" var="num">
		<!-- list 에서 값을 하나씩 꺼내어 num 에 담아라 -->
		<div>${num}</div>
	</c:forEach>
	
	<hr>
	<h1>list 출력</h1>
	<ul>
		<c:forEach items="${list}" var="num">
			<li>${num}</li>
		</c:forEach>
	</ul>
</body>
</html>