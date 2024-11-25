package kr.spring.ch11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		ProtocolHandlerFactory protocol = (ProtocolHandlerFactory)context.getBean("protocol");
		
		System.out.println(protocol);
		
		//자원정리
		context.close();
	}
}
