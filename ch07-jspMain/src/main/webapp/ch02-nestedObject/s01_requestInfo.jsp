<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클라이언트 및 서버 정보</title>
</head>
<body>
클라이언트 IP = <%= request.getRemoteAddr() %> <br>
요청정보 프로토콜 = <%= request.getProtocol() %> <br>
요청정보 전송방식 = <%= request.getMethod() %> <br>
<% /* 
URL = 서버 외부 자원을 호출할 때 사용
URI = 같은 서버내의 자원을 호출할 때 사용
*/ %>
요청 URL(Uniform Resource Locator) = <%= request.getRequestURL() %> <br>
요청 URI(Uniform Resource Identifier) = <%= request.getRequestURI() %> <br>
컨텍스트 경로 = <%= request.getContextPath() %> <br>
쿼리 문자열 = <%= request.getQueryString() %> <br>
</body>
</html>