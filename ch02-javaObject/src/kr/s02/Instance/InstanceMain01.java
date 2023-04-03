package kr.s02.Instance;

public class InstanceMain01 {
	//클래스의 기본 구조
	
	//멤버필드
	int var1;//멤버변수
	String var2;//멤버변수
	
	//생성자(명시하지 않으면 컴파일시 자동 생성)
	public InstanceMain01() {}
	
	//멤버메서드
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		InstanceMain01 me = new InstanceMain01();
		//객체의 멤버변수 값 초기화
		me.var1 = 1000;
		me.var2 = "서울";
		//객체의 멤버메서드 호출
		int result = me.sum(20,30);
		
		System.out.println(me.var1);
		System.out.println(me.var2);
		System.out.println(result);
	}
}
