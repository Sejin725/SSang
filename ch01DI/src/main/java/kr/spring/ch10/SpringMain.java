package kr.spring.ch10;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//스프링 컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//콜렉션 List <Double> 타입의 객체 선언
		PerformanceMonitor monitor = (PerformanceMonitor)context.getBean("performanceMonitor");
		
		System.out.println(monitor);
		
		//자원정리
		context.close();
;	}
}
