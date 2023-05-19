window.onload=function(){
	let pForm = document.getElementById('pForm');
	
	//submit을 했을경우
	pForm.onsubmit=function(){
		let items = document.querySelectorAll('input[type="text"]');
		for(let i=0; i<items.length; i++){
			
			//입력을 하지 않았을경우
			if(items[i].value.trim()==''){
				let label = document.querySelector('label[for="'+items[i].id+'"]');
				alert(label.textContent + ' 항목은 필수 입력');
				items[i].value = ''; //공백 입력시 공백 제거
				items[i].focus();
				return false;
			}
			//가격, 재고 숫자가 아닐경우
			if(items[i].id==="price" || items[i].id==="stock"){
				if(isNaN(Number(items[i].value))){
					alert('숫자만 입력');
					items[i].value ='';
					items[i].focus();
					return false;
				}
			}
		}
	};
};