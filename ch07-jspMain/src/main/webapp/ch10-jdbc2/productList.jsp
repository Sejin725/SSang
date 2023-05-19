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
<title>상품 목록</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="page-main">
	<h2>상품 목록</h2>
	<div class="align-right">
		<input type="button" value="상품등록" onclick="location.href='insertTest.jsp'">
	</div>
	<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		Class.forName(driverName);
		
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		sql = "select * from product order by num desc";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
	%>
		<table>
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>가격</th>
				<th>재고</th>
			</tr>
	<%
		while(rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name"); 
			int price = rs.getInt("price");
			int stock = rs.getInt("stock");
	%>
			<tr>
				<td><%=num%></td>
				<td><a href="productDetail.jsp?num=<%=num%>"><%=name%></a></td>
				<td><%=price%>원</td>
				<td><%=stock%>개</td>
			</tr>
	<%
		}// end of while()--
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
		if(rs!=null)try{rs.close();}catch(Exception e){}
		if(pstmt!=null)try{pstmt.close();}catch(Exception e){}
		if(conn!=null)try{conn.close();}catch(Exception e){}
	}
	%>
</div>
</body>
</html>