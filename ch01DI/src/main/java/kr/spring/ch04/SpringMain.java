package kr.spring.ch04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//스프링 컨테이너 생성하기
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//패키지에서 만들어둔 객체를 생성함
		//컨테이너에 DI 생성자 설정 방식으로 생성된 객체를 읽어들임
		WriteArticleService was = (WriteArticleService)context.getBean("writeArticleService");
		
		was.write();
		
		//자원정리
		context.close();
	}
}
