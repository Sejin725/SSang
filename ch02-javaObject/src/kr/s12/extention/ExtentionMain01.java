package kr.s12.extention;

//부모클래스
class Parent extends Object{ //Object 클래스는 기본적으로 상속 받으므로 생략이 되어있음
	int a = 100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}

public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
