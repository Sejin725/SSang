package kr.spring.ch09;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//XML 네임스페이스를 이용한 프로퍼티 설정
		UploadController upload = (UploadController)context.getBean("upload");
		
		System.out.println(upload);
		
		//자원정리
		context.close();
	}
}
