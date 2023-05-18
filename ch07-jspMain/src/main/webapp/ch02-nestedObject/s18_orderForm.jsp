<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>식사 및 음료 주문</title>
<script type="text/javascript">
	window.onload=function(){
		let myForm = document.getElementById('myForm');
		myForm.onsubmit=function(){
			let numbers = document.querySelectorAll('ul > li > input');
			let cnt = 0;
			for (let i = 0; i < numbers.length; i++) {
				if(!numbers[i].value==0){
					cnt++;
				}
			}
			if(cnt<0){
				alert('세가지 음식 중 하나는 꼭 주문해야 합니다.');
				return false;
			}
		};
	};
</script>
</head>
<body>
<%--
유효성 체크 : 짜장면, 짬뽕, 볶음밥 세가지 음식 중 하나는 반드시 수량 입력 필수
 --%>
<div align="center">
	<h2>식사 및 음료 주문</h2>
	<form action="s19_order.jsp" method="post" id="myForm">
		<table>
			<tr>
				<td class="title">식사류</td>
				<td>
					<ul>
						<li>
							<label for="c0">짜장면</label>
							<input type="number" name="food_c0" id="c0" min="0" max="99" value="0">
						</li>
						<li>
							<label for="c1">짬뽕</label>
							<input type="number" name="food_c1" id="c1" min="0" max="99" value="0">
						</li>
						<li>
							<label for="c2">볶음밥</label>
							<input type="number" name="food_c2" id="c2" min="0" max="99" value="0">
						</li>
					</ul>
				</td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="전송">
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>