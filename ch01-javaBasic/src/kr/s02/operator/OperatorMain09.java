package kr.s02.operator;

public class OperatorMain09 {
	public static void main(String[] args) {
/*
 논리곱(&&)
 선조건 && 후조건		결과값
 true	 true		true
 true	 false		false
 false -->미실행	 	false
 
 논리합(||)
 선조건 || 후조건		결과값
 true -->미실행		true
 false	 true		true
 false	 false		false
 		
 */
		
		System.out.println("===논리연산자===");
		//증감연산자, 비교연산자, 논리연산자
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
		
		System.out.println(a + "," + b);
		System.out.println(c);
		//false
		
		System.out.println("========================");
		
		int d,e;
		d = e = 10;
		boolean f = ++d < e++ || d++ >= ++e;
		
		System.out.println(d + "," + e);
		System.out.println(f);
		// false d=12, e=12 
		
	}
}
