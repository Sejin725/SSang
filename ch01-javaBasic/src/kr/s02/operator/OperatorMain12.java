package kr.s02.operator;

public class OperatorMain12 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		
		char ch = 'b';
		String s;//대문자인지 판단할 결과를 저장할 문자열 변수 선언
		
		//조건(삼항)연산자
		//s = (ch>=65) && (ch<=90) ? "대문자임" : "소문자임";
		s = (ch>='A') && (ch<='Z') ? "대문자임" : "소문자임";
		System.out.println(ch + " => " + s);
		
	}
}
