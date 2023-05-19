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
<title>상품 상세 정보</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="page-main">
	<h2>상품 상세 정보</h2>
	<%
	request.setCharacterEncoding("utf-8");
	int num = Integer.parseInt(request.getParameter("num"));
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try{
		Class.forName(driverName);
		
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		sql = "select * from product where num=? ";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
		
		rs = pstmt.executeQuery();
		if(rs.next()){
			int price = rs.getInt("price");
			int stock = rs.getInt("stock");
			String origin = rs.getString("origin");
			Date reg_date = rs.getDate("reg_date");
			%>
			<ul>
				<li>상품번호 : <%=num%></li>
				<li>가격 : <%=price%></li>
				<li>재고 : <%=stock%></li>
				<li>원산지 : <%=origin%></li>
				<li>등록일 : <%=reg_date%></li>
			</ul>
			<div class="align-right">
				<input type="button" value="수정" onclick="location.href='productUpdate.jsp?num=<%=num%>'">
				<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
			</div>
		<%
		}else{
		%>
			<div class="result-display">
				<div class="align-center">
					상품 상세 정보가 없습니다. <br>
					<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
				</div>
			</div>
		<%
		}
	}catch(Exception e){
		%>
		<div class="result-display">
			<div class="align-center">
				오류 발생! 상품 상세 정보 호출 실패 <br>
				<input type="button" value="상품목록" onclick="location.href='productList.jsp'">
			</div>
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