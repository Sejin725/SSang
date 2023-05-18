<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	if(cookies != null && cookies.length>0){
		for(int i=0;i<cookies.length;i++){
			//쿠키명을 이용해서 삭제할 쿠키가 존재하는지 체크
			if(cookies[i].getName().equals("name")){
				Cookie cookie = new Cookie("name","");
				//쿠키의 유효시간을 만료시켜서 삭제를 시킴
				cookie.setMaxAge(0);//유지 시간 만료
				//생성된 쿠키를 클라이언트로 전송
				response.addCookie(cookie);
				out.println("name 쿠키를 삭제합니다.");
			}
		}
	}else{
		out.println("쿠키가 존재하지 않습니다.");
	}
%>
</body>
</html>