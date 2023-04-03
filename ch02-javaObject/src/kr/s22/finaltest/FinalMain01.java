package kr.s22.finaltest;

class A{
	//지정한 값은 변경 불가능
	final int NUM = 10;	//상수 - 일반적으로 대문자를 써서 표현함
	//static 상수
	//public, static, final 모두 위치는 어디든지 사용가능하지만 문법적으로 사용하는 순서는 존재하긴 한다.
	final static public int NUMBER = 20;	// 스태틱 상수 -> 고정값, 어디에서든지 호출가능, 일반적으로 public을 사용
}
public class FinalMain01 {
	public static void main(String[] args) {
		A ap = new A();
		//상수는 변경 불가능
		//ap.NUM = 200;
		System.out.println(ap.NUM);
		System.out.println(A.NUMBER);
		
		//메서드 안에서는 접근지정자(public, private) 사용불가 (이미 메서드에서 지정해놓았기 때문)
		final int NO = 30;
		System.out.println(NO);
	} // end of main
}
