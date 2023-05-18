<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<!--
파일 Form 생성시 유의사항
1. get방식으로 전송할 경우에 파일이 아닌, 파일의 경로가 전송이 된다. 
2. enctype="multipart/form-data" 를 반드시 명시하여야 한다.
-->
<form action="s02_fileUpload.jsp" method="post" enctype="multipart/form-data">
	작성자 <input type="text" name="user"> <br>
	제목 <input type="text" name="title"> <br>
	파일명 <input type="file" name="uploadfile"> <br>
	<input type="submit" value="파일올리기">
</form>
</body>
</html>