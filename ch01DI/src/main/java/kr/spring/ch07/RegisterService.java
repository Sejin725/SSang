package kr.spring.ch07;

public class RegisterService {
	//프로퍼티
	private RegisterDAO registerDAO;
	
	//set 메서드를 만들어서 이쪽으로 타고 넘어가도록 설계
	//의존 관계 설정을 위해서 public 메서드를 정의
	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	public void write() {
		System.out.println("RegisterService의 write() 메서드 실행");
		registerDAO.insert();
	}

	
}
