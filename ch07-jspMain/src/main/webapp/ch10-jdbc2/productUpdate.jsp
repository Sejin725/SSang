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
<title>상품 수정</title>
<link rel="stylesheet" href="style.css">
<script type="text/javascript" src="script.js"></script>
</head>
<body>
<div class="page-main">
		<h2>상품 수정</h2>
	<%
		int num = Integer.parseInt(request.getParameter("num"));		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try{
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(driverName);
			
			//JDBC 수행 2단계 : Connection 객체 생성
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
			
			//SQL문 작성
			sql = "select * from product where num=? ";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC 수행 4단계 : SQL문을 테이블에 반영하고 결과물을 ResultSet에 담음
			rs = pstmt.executeQuery();
			if(rs.next()){
				String price = Integer.toString(rs.getInt("price"));
				String stock = Integer.toString(rs.getInt("stock"));
				String origin = rs.getString("origin");
			%>
				<form id="pForm" action="productUpdateAfter.jsp" method="post">
					<input type="hidden" name="num" value="<%=num%>">
					<ul>
			 			<li>
			 				<label for="price">가격</label>
			 				<input type="text" value="<%=price%>" id="price" name="price" size="18" maxlength="9" placeholder="숫자만 입력">
			 			</li>
			 			<li>
			 				<label for="stock">재고</label>
			 				<input type="text" value="<%=stock%>" id="stock" name="stock" size="18" maxlength="9" placeholder="숫자만 입력">
			 			</li>
			 			<li>
			 				<label for="origin">원산지</label>
			 				<input type="text" value="<%=origin%>" id="origin" name="origin" size="20" maxlength="10">
			 			</li>
			 		</ul>
					<div class="align-center">
						<input type="submit" value="수정">
						<input type="button" value="취소" onclick="location.href='productList.jsp'">
					</div>
				</form>
			<%
			}else{
			%>
				<div class="result-display">
					<div class="align-center">
						수정할 상품 정보 호출 실패! <br>
						<input type="button" value="목록으로" onclick="location.href='productList.jsp'">
					</div>
				</div>
			<%
			}
			
		}catch(Exception e){
			%>
			<div class="result-display">
				<div class="align-center">
					오류 발생! 수정할 상품 정보 호출 실패!<br>
					<input type="button" value="목록으로" onclick="location.href='productList.jsp'">
				</div>
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