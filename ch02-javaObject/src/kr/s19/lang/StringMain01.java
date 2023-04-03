package kr.s19.lang;

public class StringMain01 {
	public static void main(String[] args) {
		//암시적 생성 -> 같은문자열을 생성하면 동일한 객체를 바라봄
		String s1 = "abc";
		String s2 = "abc";
		
		//명시적 생성 -> 같은문자열을 생성하면 다른 객체를 바라봄
		//명시적으로 문자열을 생성하면 같은 문자열이라도 객체를 따로따로 생성함
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if (s1==s2) { // 같은 객체
			System.out.println("s1과 s2는 같은객체");
		}else {
			System.out.println("s1과 s2는 다른객체");
		}
		
		if (s1.equals(s2)) { // 같은 객체
			System.out.println("s1과 s2는 내용이 같다");
		}else {
			System.out.println("s1과 s2는 내용이 다르다");
		}
		
		if (s3==s4) { // 다른 객체
			System.out.println("s3과 s4는 같은객체");
		}else {
			System.out.println("s3과 s4는 다른객체");
		}
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println("String클래스의 HashCode는 같을수있지만, 명시적 생성으로 equals()로 비교하면 "
				+ "다른 객체임을 알수가 있다.");
		
		//문자열 비교
		if (s3.equals(s4)) {
			System.out.println("s3과 s4는 내용이 같다");
		}else {
			System.out.println("s3과 s4는 내용이 다르다");
		}
		
		
		System.out.println("------------------------------------");
		String str5 = "bus";
		String str6 = "BUS";
		
		//대소문자를 구분하지 않고 문자열 비교
		if (str5.equalsIgnoreCase(str6)) 
			System.out.println("[대소문자 구분없음] 같다");
		else
			System.out.println("[대소문자 구분없음] 다르다");
		
	}// end of main===============================================
}
