<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		request.setCharacterEncoding("utf-8");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]회원가입 출력</title>
</head>
<body>
<form action="s06_register.jsp" method="post" id="myForm">
	이름 : <%= request.getParameter("name") %> <br>
	아이디 : <%= request.getParameter("id") %> <br>
	비밀번호 : <%= request.getParameter("password") %> <br>
	전화번호 : <%= request.getParameter("phone") %> <br>
	취미 : 	<% String[] hobbys = request.getParameterValues("hobby");
				for(int i=0;i<hobbys.length; i++){
					if(i>0) out.print(",");
			%>
					<%= hobbys[i] %> 
			<%
				}
			%>
			<br>
	자기소개
			<br>
			<%= request.getParameter("content") %>
			<br>
</form>
</body>
</html>