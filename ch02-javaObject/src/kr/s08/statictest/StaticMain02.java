package kr.s08.statictest;

public class StaticMain02 {
	//인스턴스 변수
	int a;
	//static(클래스) 변수
	static String s;
	
	public static void main(String[] args) {
		//인스턴스 변수는 객체 생성 후 호출해야 함
		//System.out.println("a = " + a);
		
		//static변수는 객체 생성과 무관하며 호출시 static영역에 만들어짐
		StaticMain02.s = "고래의 꿈";
		
		//main이 static변수와 같은 클래스에 정의 되어있기 떄문에 클래스명을 생략하고 사용가능
		System.out.println("s = " + s);
	}
	

}
