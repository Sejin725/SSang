package kr.s19.lang;

public class ObjectMain {
	public static void main(String[] args) {
		//ObjectMain에 Object가 상속되어 있고 Object로 부터 상속받은 메서드를 호출
		ObjectMain om = new ObjectMain();
		//클래스 정보 반환
		System.out.println(om.getClass());
		//클래스명 반환
		System.out.println(om.getClass().getName());
		//해시코드 (10진수)반환
		System.out.println(om.hashCode());
		//해시코드 (16진수)반환
		System.out.println(Integer.toHexString(om.hashCode()));
		//참조값 반환(객체의 기본동작)
		System.out.println(om.toString());
		System.out.println(om);
	}
}
