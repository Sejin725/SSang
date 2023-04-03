package kr.s08.statictest;

class StaticMethod{
	//인스턴스변수
	String s1 = "서울";
	//static(클래스) 변수
	static String s2 = "한국";
	//static메서드
	public static String getString() {
		return s2;
	}
}
public class StaticMain03 {
	public static void main(String[] args) {
		//static메서드는 클래스명.메서드명의 형식으로 호출한다.
		System.out.println(StaticMethod.getString());
		
		
	}
}
