package kr.spring.ch02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringMain {
	public static void main(String[] args) {
		//스프링 컨테이너 생성하기
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//객체를 컨테이너로부터 읽어들임
		StudentBean stu = (StudentBean)context.getBean("studentBean");
		
		stu.setName("이금자");
		stu.setsNum(99);
		
		stu.study("국어");
		stu.studentInfo();
		
		//자원정리
		context.close();
	}
}
