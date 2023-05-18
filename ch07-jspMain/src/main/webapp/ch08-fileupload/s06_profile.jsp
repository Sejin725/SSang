<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프로필 사진 업로드 처리</title>
</head>
<body>
<h2>저장된 프로필 사진</h2>
<%
	String saveFolder = "/upload";
	String encType = "utf-8";
	int maxSize = 10*1024*1024;
	
	String realFolder = application.getRealPath(saveFolder);
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	String file = multi.getFilesystemName("file");
%>
<img alt="" src="/ch07-jspMain/upload/<%=file%>">
</body>
</html>