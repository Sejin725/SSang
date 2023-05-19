<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Date" %>
<%@ include file="dbInfo.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 수정 Update</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	int num = Integer.parseInt(request.getParameter("num"));
	int price = Integer.parseInt(request.getParameter("price"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	String origin = request.getParameter("origin");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = null;
	
	try{
		Class.forName(driverName);
		
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		sql = "update product SET price=?, stock=?, origin=? where num=?";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, price);
		pstmt.setInt(2, stock);
		pstmt.setString(3, origin);
		pstmt.setInt(4, num);
		
		pstmt.executeUpdate();
		
%>
		<div class="result-display">
			<div class="align-center">
				상품 수정 완료 <br>
				<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
			</div>
		</div>
<%
		
	}catch(Exception e){
%>
		<div class="result-display">
			<div class="align-center">
				오류 발생! 상품 수정 실패 <br>
				<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
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







