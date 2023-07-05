package kr.spring.ch08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성하기
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//DI 프로퍼티 설정 방식으로 생성된 객체 호출
		WorkController work = (WorkController)context.getBean("work");
		
		System.out.println(work);
		
		//자원 정리
		context.close();
	}
}
