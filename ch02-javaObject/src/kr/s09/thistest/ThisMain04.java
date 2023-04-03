package kr.s09.thistest;

public class ThisMain04 {
	/*
	 * 생성자 내부에서 또다른 생성자를 호출할 때 this()를 표시함.
	 * this()를 이용해서 또다른 생성자를 호출하는 경우는
	 * 생성자 내부에 반복적인 코드가 있어서 반복적인 코드를 제거하고
	 * 코드를 재사용하고자 할 때 this()를 명시함
	 */
	
	public ThisMain04() {
		this("바람");
		System.out.println("*********");
	}
	public ThisMain04(String msg) {
		System.out.println(msg);
	}
	public ThisMain04(int a) {
		System.out.println(String.valueOf(a));
	}
	
	public static void main(String[] args) {
		ThisMain04 tm1 = new ThisMain04();
		ThisMain04 tm2 = new ThisMain04("여름");
		ThisMain04 tm3 = new ThisMain04(1000);
	}
}
