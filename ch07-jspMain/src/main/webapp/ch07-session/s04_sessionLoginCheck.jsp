<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 여부 검사</title>
</head>
<body>
<%
					// Object로 넘겨오기 때문에, String으로 다운캐스팅을 함
	String user_id = (String)session.getAttribute("user_id");
	if(user_id != null){//로그인이 된 경우
%>
		아이디 [<%= user_id %>]로 로그인 한 상태!
		<br>
		<input type="button" value="로그아웃" onclick="location.href='s05_sessionLogout.jsp'">
<%
	}else{//로그인이 되지 않은 경우
%>
		로그인하지 않은 상태
		<br>
		<input type="button" value="로그인" onclick="location.href='s02_sessionLoginForm.jsp'">
<%
	}
%>
</body>
</html>