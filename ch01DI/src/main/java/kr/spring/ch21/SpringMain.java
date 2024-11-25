package kr.spring.ch21;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.product.Product;

public class SpringMain {
	public static void main(String[] args) {
		//컨테이너 생성
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_aop.xml");
		
		Product p = (Product)context.getBean("product");
		
		//핵심 기능 호출
		p.launch();
		
		//자원정리
		context.close();
	}
}
