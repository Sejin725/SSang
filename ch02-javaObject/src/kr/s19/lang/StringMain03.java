package kr.s19.lang;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = " aBa ";
		String s2 = "abc";
		int a = 100;
		String msg = null;
		
		//대문자로 변환
		msg = s1.toUpperCase();
		System.out.println("msg : " + msg);
		
		//소문자로 변환
		msg = s1.toLowerCase();
		System.out.println("msg : " + msg);
		
		//old 문자를 new 문자로 대체
		msg = s1.replace("aB", "B");
		System.out.println("msg : " + msg);
		
		//문자열 앞뒤 공백 제거
		msg = s1.trim();
		System.out.println("msg : " + msg);
		
		//대상 문자열에 검색하는 문자열이 포함되어있는지 검증
		boolean f = s1.contains("aB");
		System.out.println("f : " + f);
		
		//검색하는 문자열이 대상 문자열의 앞에 위치하는지 검증
		f = s2.startsWith("ab");
		System.out.println("f : " + f);
		
		//검색하는 문자열이 대상 문자열의 앞에 위치하는지 검증
		f = s2.endsWith("bc");
		System.out.println("f : " + f);
		
		//int -> String 변환
		msg = String.valueOf(a);
		msg = a + "";
		System.out.println("msg : " + msg);
		
	} // end of main 
}
