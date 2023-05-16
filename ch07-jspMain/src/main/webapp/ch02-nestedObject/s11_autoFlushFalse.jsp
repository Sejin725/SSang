<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb"  autoFlush="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오토 플러쉬 속성 값 false 예제</title>
</head>
<body>
<%
	for(int i=0; i<1000; i++){
%>
	1234
<%
	}
%>
</body>
</html>