package kr.s13.packtwo;

import kr.s13.packone.People;

public class AccessMain01 {
	public static void main(String[] args) {
		People p = new People();
		//System.out.println(p.a);	//private, 	같은 클래스가 아니어서 호출불가
		//System.out.println(p.b);	//default, 	같은 패키지가 아니어서 호출불가
		//System.out.println(p.c);	//protected,같은 패키지, 상속받지 아니어서 호출불가
		System.out.println(p.d);	//public	다른 패키지 어디에서나 호출 가능
		
	}
}
