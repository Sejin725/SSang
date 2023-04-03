package kr.s23.enumtest;

public class EnumMain01 {
	//문자열 상수
	public static final String JAVA = "JAVA";
	public static final String ORACLE = "ORACLE";
	public static final String HTML = "HTML";
	
	public static void main(String[] args) {
		//현재 해당 변수가 같은 클래스 내부에 존재하기 때문에, 클래스명을 생략할 수 있다.
		System.out.println(JAVA);
		System.out.println(ORACLE);
		System.out.println(HTML);
	}
}
