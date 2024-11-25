<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- isErrorPage 속성은 에러페이지인지 여부 지정 --%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 발생</title>
</head>
<body>
요청 처리 과정에서 예외가 발생했습니다. <br>
빠른 시간 내에 문제를 해결하도록 하겠습니다. <br>
<p>
에러 타입 : <%= exception.getClass().getName() %> <br>
에러 메세지 : <b><%= exception.getMessage() %></b> 
</p>
</body>
</html>