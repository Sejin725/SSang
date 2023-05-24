<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL의 기본적인 사용법</title>
<style type="text/css">
	body{
		text-align: center;
	}
	table{
		margin : 0 auto;
	}
</style>
</head>
<body>
<h3>EL의 기본적인 사용법</h3>
<table border="1" style="width: 60%;">
	<tr>
		<th>표현식</th>
		<th>값</th>
	</tr>
	<tr>
		<td>\${ 2 + 5 }</td>
		<td>${ 2 + 5 }</td>
	</tr>
	<tr>
		<td>\${ "10" + 5 } = 자동으로 형변환 후 연산진행</td>
		<td>${ "10" + 5 }</td>
	</tr>
	<tr>
		<td>\${ "십" + 5 }</td>
		<td>에러발생(EL에서의 '+' 는 연산만)</td>
	</tr>
	<tr>
		<td>\${ 4/5 }</td>
		<td>${ 4/5 }</td>
	</tr>
	<tr>
		<td>\${ 2+=5 }</td>
		<td>${ 2+=5 }</td>
	</tr>
	<tr>
		<td>\${ "한국"+="서울" }</td>
		<td>${ "한국"+="서울" }</td>
	</tr>
</table>
</body>
</html>













