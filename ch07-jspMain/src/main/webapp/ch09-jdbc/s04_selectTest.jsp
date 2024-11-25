<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>
<%@ include file="dbInfo.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="page-main">
	<h2>게시판 목록</h2>
	<div class="align-right">
		<input type="button" value="글쓰기" onclick="location.href='s02_insertTestForm.jsp'">
	</div>
	<%
	//DB연동
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(driverName);
		//JDBC 수행 2단계 : DB 연결
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		//SQL 문 작성
		sql = "select * from tboard order by num desc";
		
		//JDBC 수행 3단계 : pstmt 객체 생성
		pstmt = conn.prepareStatement(sql);
		
		//JDBC 수행 4단계 : SQL문 실행
		rs = pstmt.executeQuery();
	%>
		<table>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
	<%
		while(rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			String title = rs.getString("title");
			//시, 분, 초 까지 뽑길 원하면 String타입으로 명시하면 된다.
			Date reg_date = rs.getDate("reg_date");
	%>
			<tr>
				<td><%= num %></td>
				<td><a href="s05_detailTest.jsp?num=<%=num%>"><%= title %></a></td>
				<td><%= name %></td>
				<td><%= reg_date %></td>
			</tr>
	<%
		}// end of while()-----
	%>
		</table>
	<%
	}catch(Exception e){
	%>
		<div class="result-display">
			<span>오류 발생!</span>
		</div>
	<%
		e.printStackTrace();
	}finally{
		if(rs!=null)try{rs.close();}catch(SQLException e){}
		if(pstmt!=null)try{pstmt.close();}catch(SQLException e){}
		if(conn!=null)try{conn.close();}catch(SQLException e){}
	}
	%>
</div>
</body>
</html>


