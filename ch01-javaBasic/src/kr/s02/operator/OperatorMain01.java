package kr.s02.operator;

public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("===증감연산자===");
		//증가연산자
		int i=5;
		//증가연산자를 변수앞에 명시하면 변수값을 1증가시킨 후 증가된 값을 읽어옴
		System.out.println(++i);
		System.out.println("==============");
		//증가연산자를 변수뒤에 명시하면 변수값을 먼저 읽어온 후 메모리의 변수 값을 1증가시킴.
		//증가된 값을 보기 위해서는 한 번 더 호출해야 함.
		System.out.println(i++);
		System.out.println("==============");
		System.out.println(i);
		System.out.println("==============");
		
		//감소연산자
		int j=10;
		//감소연산자를 변수앞에 명시하면 변수값을 1감소시킨 후 감소된 값을 읽어옴
		System.out.println(--j);
		System.out.println("==============");
		//감소연산자를 변수뒤에 명시하면 변수값을 먼저 읽어온 후 메모리의 변수 값을 1감소시킴.
		System.out.println(j--);
		System.out.println("==============");
		System.out.println(j);
	}
}
