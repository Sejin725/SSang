<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 다중 업로드 처리</title>
</head>
<body>
<%
	String saveFolder ="/upload";
	String encType = "utf-8";
	int maxSize = 10*1024*1024;
	//upload의 절대 경로
	String realFolder = application.getRealPath(saveFolder);
	
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	String img1 = multi.getFilesystemName("uploadfile1");
	String img2 = multi.getFilesystemName("uploadfile2");
	System.out.println(img1);
	
%>
이름 : <%= multi.getParameter("name") %> <br>
제목 : <%= multi.getParameter("title") %> <br>
------------------------------------------------------<br>

<img alt="" src="/ch07-jspMain/upload/<%= img1 %>"> <br>
<img alt="" src="/ch07-jspMain/upload/<%= img2 %>">


</body>
</html>