<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%
	//보관만 클라이언트에서 하되, 대게 사용처는 서버에서 클라이언트 정보를 필요로 하기 때문에 인코딩을 함 
	Cookie cookie = new Cookie("name",URLEncoder.encode("홍길동","UTF-8"));
	//쿠키 유효시간 지정(단위:초)
	//쿠키 유효시간을 지정하면 클라이언트 영역에 파일을 생성해서 쿠키 정보 보관
	//쿠키 유효시간을 미지정시, 메모리에 쿠키 정보를 보관
	//cookie.setMaxAge(30*60); 	// 30분
	//cookie.setMaxAge(-1);		// 메모리에 쿠키 정보 보관
	
	//클라이언트에 쿠키 전송
	response.addCookie(cookie);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
<%= cookie.getName() %> 쿠키의 값은 : <%= cookie.getValue() %>
</body>
</html>