<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 출력</title>
</head>
<body>
<%-- 테스트목적으로 NullpointerException 발생 시킴 --%>
name 파라미터 값 : <%= request.getParameter("name").toUpperCase() %>
</body>
</html>