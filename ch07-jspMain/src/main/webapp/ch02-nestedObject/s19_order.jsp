<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap"%>
<%! 
	HashMap<String,String> food_name = new HashMap<String,String>();
	HashMap<String,Integer> food_price = new HashMap<String,Integer>();
   	int sum = 0;
%>
<% 
   	request.setCharacterEncoding("utf-8"); 
	food_name.put("food_c0", "짜장면");
	food_name.put("food_c1", "짬뽕");
	food_name.put("food_c2", "볶음밥");
	food_price.put("food_c0", 4000);
	food_price.put("food_c1", 5000);
	food_price.put("food_c2", 6000);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서 확인</title>
</head>
<body>
<%--
짜장면 4,000원, 짬뽕 5,000원, 볶음밥 6,000원

[출력 예시]
짜장면 2개
짬뽕 1개
총 지불금액 : 13,000원
 --%>
 <% 
	 for(int i=0; i<food_name.size(); i++){
		 String key = "food_c" + Integer.toString(i);
		 
		 int food_val = Integer.parseInt(request.getParameter(key));
		 //0보다 클 경우에 출력
		 if(food_val > 0){
			 sum += food_price.get(key)*food_val;
 %>
 		 <%= food_name.get(key) %> <%= food_val %>개<br>
 <%
		 }
	 }
 %>
 총 지불금액 : <%= String.format("%,d원",sum) %><% sum=0; %>
</body>
</html>