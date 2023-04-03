package kr.s06.capsule;

class Capsule {
	//은닉화
	private int a;
	
	//데이터 반환
	public int getA() {
		return a;
	}
	//데이터 입력
	public void setA(int n) {
		if (n >= 0) {
			a = n;
		} else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		/*
		 * 변수 a의 접근 지정자(제한자)가 private이기 때문에 같은 클래스내에서는 호출이 가능하지만 다른 클래스에서 호출 불가능
		 */
		// cap.a = -1;
		// System.out.println(cap.a);
		
		cap.setA(100); //데이터 저장
		System.out.println(cap.getA());//데이터 호출
		System.out.println("=====================");
		
		cap.setA(-200);
		System.out.println(cap.getA());//데이터 호출
	}
}
