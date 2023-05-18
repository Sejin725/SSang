<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.io.File" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 처리</title>
</head>
<body>
<%
	//파일 업로드 경로
	String saveFolder = "/upload";
	String encType = "utf-8";	//인코딩 타입
	int maxSize = 10*1024*1024;	//최대 10MB까지 지원
	
	//파일 업로드 절대 경로 구하기
	String realFolder = application.getRealPath(saveFolder);
	out.println("파일 업로드 절대 경로 : " + realFolder + "<br>");
	out.println("------------------------------------------------------<br>");
	
	//데이터를 뽑기위한 객체 선언(request, 경로, 사이즈, 인코딩타입, 파일명이 안겹치도록 해주는 객체)
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	out.println("작성자 : " + multi.getParameter("user") + "<br>");
	out.println("제목 : " + multi.getParameter("title") + "<br>");
	out.println("------------------------------------------------------<br>");
	
	//파일 정보 처리
	//전송전 원래의 파일 이름
	String original = multi.getOriginalFileName("uploadfile");
	//서버에 저장된 파일 이름
	String filename = multi.getFilesystemName("uploadfile");
	out.println("전송전 원래의 파일 이름 : " + original + "<br>");
	out.println("서버에 저장된 파일 이름 : " + filename + "<br>");
	
	//전송된 파일의 컨텐트 타입
	String type = multi.getContentType("uploadfile");
	out.println("컨텐트 타입 : " + type + "<br>");
	
	//파일 용량 구하기
	File file = multi.getFile("uploadfile");
	out.println("파일 용량 : " + file.length() +"(bytes)");
	
	
	
	
	
	
%>

</body>
</html>