package kr.s03.method;

public class MethodArgMain03 {
	//인자 전달 방식 : Variable Arguments
	//자료형이 일치할 때 전달하고자 하는 값의 개수를 다르게 지정할 수 있다.
	//전달되는 데이터는 내부적으로 배열로 인식함
	public void argTest(int ... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("n["+i+"]:" + n[i]);
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodArgMain03 ma = new MethodArgMain03();
		ma.argTest();
		ma.argTest(10);
		ma.argTest(10,20);
		ma.argTest(10,20,30);
	}
}
