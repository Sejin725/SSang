package kr.spring.ch15;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		SystemMonitor sys = (SystemMonitor)context.getBean("systemMonitor");
		
		System.out.println(sys);
		
		context.close();
	}
}
