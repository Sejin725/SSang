<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.member.dao.MemberDAO" %>
<%@ page import="kr.member.vo.MemberVO" %>
<%
	Integer user_num = (Integer)session.getAttribute("user_num");
	if(user_num==null){
		//로그인이 되지 않은 경우
		response.sendRedirect("loginForm.jsp");
	}else{
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//자바빈을 생성하고 전송된 데이터를 저장
		MemberVO member = new MemberVO();
		member.setNum(user_num);
		member.setName(request.getParameter("name"));
		member.setPasswd(request.getParameter("passwd"));
		member.setEmail(request.getParameter("email"));
		member.setPhone(request.getParameter("phone"));
		
		MemberDAO dao = MemberDAO.getInstance();
		dao.updateMember(member);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정완료</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/style.css">
</head>
<body>
<div class="page-main">
	<h1>회원정보수정 완료</h1>
	<div class="result-display">
		회원정보수정 완료 <br>
		<button onclick="location.href='myPage.jsp'">MyPage</button>
	</div>
</div>
</body>
</html>
<%

%>