package kr.spring.ch21;

//공통 기능 클래스
public class MyFirstAdvice {
	/*
	 * 구현 가능한 Advice(언제 공통 기능을 핵심 기능에 적용 할지 정의)
	 * 
	 * 	종류						설명
	 * Before Advice				대상 객체의 메서드 호출 전에 공통 기능을 실행
	 * 
	 * After Returning Advice		대상 객체의 메서드가 예외 없이 실행한 후 공통 기능을 실행
	 * 
	 * After Throwing Advice		대상 객체의 메서드를 실행하는 도중에 예외가 발생한 경우에 공통 기능을 실행
	 * 
	 * After Advice					대상 객체의 메서드를 실행하는 도중 예외가 발생했는지의 여부와 상관없이 메서드 실행 후
	 * 								공통 기능을 실행
	 */

	public void before() {
		//메서드(핵심 기능) 시작 직전에 동작하는 어드바이스
		System.out.println("Hello Before! **메서드가 호출되기 전에 나온다!\n");
	}
	
	public void afterReturning(String msg) {
		//메서드 호출이 예외를 내보내지 않고 종료했을 때
		//동작하는 어드바이스
		System.out.println("Hello AfterReturning!  **메서드가 호출한 후에 나온다! 전달된 객체 : " + msg);
	}
}
