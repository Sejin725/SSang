package kr.s03.operation;

public class IfMain05 {
	public static void main(String[] args) {
		int a = 10;
		float b = 10.0f;
		
		if( a==b ) {// a의 자료형이 float로 자동형변환이 일어남
			System.out.println("10과 10.0f는 같다");
		}
		char c = '0'; //'0'의 아스키 코드값은 48
		int d = 0;
		
		if (c != d) {//c는 int로 형변환되어 48로 인식
			System.out.println("'0'과 0은 같지 않다.");
		}
		
		char e ='A'; //'A'는 아스키 코드 65
		int f = 65;
		
		if (e == f) {//e는 int로 형변환되어 65로 인식
			System.out.println("'A'는 65와 같다.");
		}
	}
}
