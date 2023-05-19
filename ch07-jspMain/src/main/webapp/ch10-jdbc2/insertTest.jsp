<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<link rel="stylesheet" href="style.css">
<script type="text/javascript" src="productScript.js"></script>
</head>
<body>
<%--
[실습]
등록 항목 : 상품명, 가격, 재고, 원산지 입력
목록 : 상품번호, 상품명, 가격, 재고
상세 : 상품번호, 가격, 재고, 원산지, 등록일
수정 : 가격, 재고, 원산지
 --%>
 <div class="page-main">
 	<h2>상품 등록</h2>
 	<form id="pForm" action="productInsert.jsp" method="post">
 		<ul>
 			<li>
 				<label for="name">상품명</label>
 				<input type="text" id="name" name="name" size="20" maxlength="10">
 			</li>
 			<li>
 				<label for="price">가격</label>
 				<input type="text" id="price" name="price" size="18" maxlength="9" placeholder="숫자만 입력">
 			</li>
 			<li>
 				<label for="stock">재고</label>
 				<input type="text" id="stock" name="stock" size="18" maxlength="9" placeholder="숫자만 입력">
 			</li>
 			<li>
 				<label for="origin">원산지</label>
 				<input type="text" id="origin" name="origin" size="20" maxlength="10">
 			</li>
 		</ul>
 		<div class="align-center">
 			<input type="submit" value="등록">
 			<input type="button" value="취소" onclick="location.href='productList.jsp'" >
 		</div>
 	</form>
 </div>
</body>
</html>