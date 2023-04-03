package kr.s17.poly;

//부모클래스
class Parent2{
	int a = 10;
	public void make() {
		System.out.println("부모클래스의 make");
	}
}
//자식클래스
class Child2 extends Parent2{
	int b = 20;
	//메서드 재정의
	@Override
	public void make() {
		System.out.println("자식클래스의 make");
	}
}
public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make();
		System.out.println("--------------------");
		
		//자식클래스타입 -> 부모클래스타입 ,업캐스팅 형변환
		Parent2 p = ch;
		//형변환을 한 상태에서 오버라이딩(재정의) 되어있는 메서드를 호출하면 재정의 되어있는 메서드를 호출함
		p.make();
		
		
	}
}
