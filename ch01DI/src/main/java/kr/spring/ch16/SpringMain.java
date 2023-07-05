package kr.spring.ch16;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annot.xml");
		
		SystemMonitor sys = (SystemMonitor)context.getBean("monitor");
		
		System.out.println(sys.getPeriodTime());
		System.out.println(sys.getSender());
		
		context.close();
	}
}
