package kr.s13.packtwo;

import kr.s13.packone.People;

public class AccessMain02 extends People{
	public static void main(String[] args) {
		AccessMain02 am = new AccessMain02();
		//System.out.println(am.a);	//private, 	같은 클래스가 아니어서 호출불가
		//System.out.println(am.b);	//default, 	같은 패키지가 아니어서 호출불가
		System.out.println(am.c);	//protected 상속을 받아서 호출가능
		System.out.println(am.d);	//public	호출가능
		
	}
}
