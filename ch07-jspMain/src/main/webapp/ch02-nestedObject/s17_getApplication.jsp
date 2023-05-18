<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 기본객체 속성 보기</title>
</head>
<body>
<%
						// 모든 속성명 반환함
	Enumeration attrEnum = application.getAttributeNames();
	//모든 값을 반환할때 까지 반복
	while(attrEnum.hasMoreElements()){
		//속성명을 name에 저장
		String name =(String)attrEnum.nextElement();
		//속성값을 value에 저장
		Object value = application.getAttribute(name);
%>
		application 속성 : <b><%= name %></b> = <%= value %> <br>
<%		
	}
%>
</body>
</html>