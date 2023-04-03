package kr.s17.poly;

//부모클래스
class Parent{
	int a = 100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}
public class PolyMain01 {
	/*
	 * 다형성(Polymorphism)
	 * 다형성은 여러가지 형태를 가질 수 있는 능력
	 * 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써 다형성을 프로그램적으로 구현.
	 * 부모클래스 타입의 참조 변수로 자식클래스의 객체를 참조
	 */
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; //ch에 저장된 객체의 주소를 p에 저장함
					   //자식클래스타입 -> 부모클래스타입 형변환 (업캐스팅, 자동적으로 형변환)
		//참조자료형을 부모클래스타입으로 명시하면 부모클래스영역의 멤버만 호출 가능
		System.out.println(p.a);
		//System.out.println(p.b); p객체의 전신은 Parent이므로, 호출불가 (메모리에 정보는 저장되어있음)
		
		//부모클래스타입 -> 자식클래스타입으로 형변환 (명시적 형변환)
		//다운캐스팅, 명시적으로 형변환
		Child ch2 = (Child)p;
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}
}
