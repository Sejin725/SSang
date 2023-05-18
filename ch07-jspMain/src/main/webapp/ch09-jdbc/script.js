window.onload=function(){
	let myForm = document.getElementById('myForm');
	
	//submit을 했을경우
	myForm.onsubmit=function(){
		let items = document.querySelectorAll('input[type="text"],input[type="password"],textarea');
		for(let i=0; i<items.length; i++){
			
			//입력을 하지 않았을경우
			if(items[i].value.trim()==''){
				let label = document.querySelector('label[for="'+items[i].id+'"]');
				alert(label.textContent + ' 항목은 필수 입력');
				items[i].value = ''; //공백 입력시 공백 제거
				items[i].focus();
				return false;
			}
		}
	};
};