package kr.spring.ch07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//스프링 컨테이너를 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//DI 프로퍼티 설정 방식으로 생성된 객체 호출
		RegisterService service = (RegisterService)context.getBean("registerService");
		
		//메서드 호출
		service.write();
		
		//자원정리
		context.close();
	}
}
