<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>if 태그</title>
</head>
<body>
<c:if test="true">
	무조건 수행해서 표현함<br>
</c:if>
<c:if test="${param.name == 'dragon'}">
	name 파라미터의 값은 ${param.name} 입니다.<br>
</c:if>
<c:if test="${param.name.equals('dragon')}">
	<br>equals 활용<br>
	name 파라미터의 값은 ${param.name} 입니다.<br>
</c:if>
<br>
<%-- 단일 if 문 --%>
<c:if test="${param.age >= 20}"/>
	당신의 나이는 20세 이상 입니다.
</body>
</html>