<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[실습]회원가입</title>
<script type="text/javascript">
	window.onload=function(){
		let form = document.getElementById('myForm');
		form.onsubmit=function(){
			let name = document.getElementById('name');
			if (name.value.trim()=='') {
				alert('이름을 입력하세요');
				name.value='';
				name.focus();
				return false;
			}

			let id = document.getElementById('id');
			if (id.value.trim()=='') {
				alert('아이디를 입력하세요');
				id.value='';
				id.focus();
				return false;
			}
			
			let password = document.getElementById('password');
			if (password.value.trim()=='') {
				alert('비밀번호를 입력하세요');
				password.value='';
				password.focus();
				return false;
			}else if(/^[A-Za-z0-9]{4,10}$/.test(password.value)){
				alert('영문 또는 숫자 사용, 최소 4자 ~ 최대 10자를 사용하세요!');
				password.value='';
				password.focus();
                return false;
			}

			let phone = document.getElementById('phone');
			if (phone.value.trim()=='') {
				alert('전화번호를 입력하세요');
				phone.value='';
				phone.focus();
				return false;
			}else if(/^\d{3}-\d{4}-\d{4}$/.test(phone.value)){
				alert('전화번호는 000-0000-0000 형식에 맞게 입력하세요');
				phone.value='';
				phone.focus();
                return false;
			}

			let hobby = document.getElementsByClassName('hobby');
			let cnt = 0;
			for (let i = 0; i < hobby.length; i++) {
				if (hobby[i].checked) {
					cnt++;
				}
			}
			if (cnt<1) {
				alert('취미를 1개 이상 체크하세요');
				return false;
			}
			
			let content = document.getElementById('content');
			if (!check(content,'자기소개')) {
				return false;
			}
		};// end of onsubmit()
		
		
		function check(item,name){
			if (item.value.trim()=='') {
				alert(name + " 필수");
				item.value='';
				item.focus();
				return false
			}else{
				return true
			}
		}
	};
</script>
</head>
<body>
<form action="s06_register.jsp" method="post" id="myForm">
	이름 : <input type="text" name="name" id="name" size="10" > <br>
	아이디 : <input type="text" name="id" id="id" size="10" > <br>
	비밀번호 : <input type="password" name="password" id="password" size="10" > <br>
	전화번호 : <input type="text" name="phone" id="phone" size="30" > <br>
	취미 : 	<input type="checkbox" name="hobby" class="hobby" value="영화보기" >영화보기 
			<input type="checkbox" name="hobby" class="hobby" value="음악감상" >음악감상 
			<input type="checkbox" name="hobby" class="hobby" value="등산" >등산 
			<input type="checkbox" name="hobby" class="hobby" value="낚시" >낚시 
			<input type="checkbox" name="hobby" class="hobby" value="댄스" >댄스 
			<br> 
			자기소개 
			<br>
			<textarea rows="5" cols="60" name="content" id="content"></textarea> 
			<br>
		<input type="submit" value="전송">
</form>
</body>
</html>