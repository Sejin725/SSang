<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script>
window.onload=function(){
	alert('회원정보 수정이 완료되었습니다.');
	location.href='detailUserForm.do?mem_num=${mem_num}';
};
	
</script>