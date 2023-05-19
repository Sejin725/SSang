<%@page import="java.sql.Driver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ include file="dbInfo.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록 처리</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name"); 
	int price = Integer.parseInt(request.getParameter("price"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	String origin = request.getParameter("origin"); 

	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = null;
	
	try{
		Class.forName(driverName);
		
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		
		sql = "insert into product (num, name, price, stock, origin, reg_date) values " 
			+ "(product_seq.nextval, ?, ?, ?, ?, sysdate)";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setInt(2, price);
		pstmt.setInt(3, stock);
		pstmt.setString(4, origin);
		
		pstmt.executeQuery();
		
	%>
		<div class="result-display">
			<div class="align-center">
				상품 등록 완료 <br>
				<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
			</div>
		</div>
	<%
		
	}catch(Exception e){
	%>
		<div class="result-display">
			<div class="align-center">
				오류발생 - 상품 등록 실패 <br>
				<input type="button" value="목록으로 돌아가기" onclick="location.href='productList.jsp'">
			</div>
		</div>
	<%
		e.printStackTrace();
	}finally{
		if(pstmt!=null)try{pstmt.close();}catch(Exception e){}
		if(conn!=null)try{conn.close();}catch(Exception e){}
	}
%>
</body>
</html>