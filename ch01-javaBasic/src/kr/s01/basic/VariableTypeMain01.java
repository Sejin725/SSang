package kr.s01.basic;
public class VariableTypeMain01 {
	public static void main(String[] args) {
		System.out.println("===논리형===");
		//논리형(true,false)
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");
		//문자형, 크기 : 2byte, 표현범위 : 0~65,535
		//다국어처리를 위한 유니코드(unicode) 방식
		char c1 = 'A';// 내부적으로 아스키코드값 65로 인식
		System.out.println("c1 = " + c1);
		
		char c2 = 65;// A에 해당하는 아스키코드값을 직접 입력
		System.out.println("c2 = " + c2);
		
		char c3 = '\u0041';// A를 유니코드로 표현
		System.out.println("c3 = " + c3);
		
		char c4 = '자';// 한글은 2byte로 표현이 가능하다
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790';
		System.out.println("c5 = " + c5);
		
		System.out.println("===정수형===");
		//byte, 크기 : 1byte, 표현범위 : -128 ~ 127
		byte b1 = 127;
		System.out.println("b1 = " + b1);
		
		//short, 크기 : 2byte, 표현범위 : -32,768 ~ 32,767
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4byte, 표현범위 : -2,147,483,648 ~ 2,147,483,647
		int n1 = 2147483647;
		System.out.println("n1 = " + n1);
		
		//long, 크기 : 8byte
		long lg = 56789L;
		System.out.println("lg = " + lg);
		
		System.out.println("===실수형===");
		//float, 크기 : 4byte
		float f1 = 9.1f;
		System.out.println("f1 = " + f1);
		
		//double, 크기 : 8byte
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
		
		System.out.println("===문자열 표시===");
		//문자열은 기본자료형이 아닌 참조자료형임
		String str = "Hello World!";
		System.out.println("str = " + str);
		
	}
}
