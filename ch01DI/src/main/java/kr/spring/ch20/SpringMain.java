package kr.spring.ch20;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//자바코드 기반 설정
		Executor executor = (Executor)context.getBean("executor");
		
		executor.addUnit();
		
		//자원정리
		context.close();
	}
}
