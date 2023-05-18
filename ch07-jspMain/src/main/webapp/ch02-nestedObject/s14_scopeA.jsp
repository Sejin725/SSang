<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 4개 기본객체와 영역</title>
</head>
<body>
<%						   //속성명 속성값
	pageContext.setAttribute("msg1", "봄");
	request.setAttribute("msg2", "여름");
	session.setAttribute("msg3", "가을");
/* 
	pageContext 는 해당 페이지 내에서만 정보가 저장이 되고, 다른페이지로 이동시, 데이터가 소멸된다.
	request 는 해당 페이지 내에서만 정보가 저장이 되고, 다른페이지로 이동시, 데이터가 소멸된다.
	session 은 다른페이지로 이동시에도 정보를 가지고 있다. (데이터 공유가능)
	하지만, 세션은 브라우저를 종료시 모든 세션정보를 소멸시킨다.
*/
%>
page 영역의 msg1 = <%= pageContext.getAttribute("msg1") %> <br>
request 영역의 msg2 = <%= request.getAttribute("msg2") %> <br>
session 영역의 msg3 = <%= session.getAttribute("msg3") %> <br>

</body>
</html>