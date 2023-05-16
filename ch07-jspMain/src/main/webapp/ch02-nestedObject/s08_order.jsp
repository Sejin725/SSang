<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! HashMap<String,Integer> item = new HashMap<String,Integer>();
    	int sum = 0;%>
    <% request.setCharacterEncoding("utf-8"); 
    	item.put("가방", 200000);
    	item.put("신발", 100000);
    	item.put("옷", 50000);
    	item.put("식사권", 150000);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 내역</title>
</head>
<body>
<%--
구매 금액이 30만원 미만이면 배송비 5천원 추가
[출력 예시]
이름 :
배송희망일 :
구입 내역 :
배송비 :
총 구매 비용(배송비포함) :
 --%>
 이름 : <%= request.getParameter("name") %> <br>
 배송희망일 : <%= request.getParameter("order_date") %> <br>
 구입 내역 : 
 <%
 	String[] items = request.getParameterValues("item");
 	for(int i=0; i<items.length; i++){
 		if(i>0) out.print(",");
 		sum += item.get(items[i]);
 %>
 		<%= items[i] %>
 <%	
 	}
 %> 
 <br>
 배송비 : <% if(sum<300000) {out.print(5000 +" 원"); sum += 5000;}
			else out.print(0 +" 원");
 		  %>
 <br>
 총 구매 비용(배송비포함) : <%= String.format("%,d원",sum) %><% sum=0; %>
 
</body>
</html>