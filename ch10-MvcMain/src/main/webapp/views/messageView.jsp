<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 패턴을 적용한 view 사용하기</title>
</head>
<body>
messageView.jsp에서 생성한 HTML 화면입니다. <br>
결과 (스크립트릿) = <%= request.getAttribute("result") %>
<br>
결과 (EL) = ${result}
<br>
결과 (EL.Scope) = ${requestScope.result}
</body>
</html>