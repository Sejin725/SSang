package kr.spring.ch03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		OperatorBean bean = (OperatorBean)context.getBean("operatorBean");
		
		int result = bean.add(3, 7);
		System.out.println(result);
		
		context.close();
	}
}
