package kr.s19.lang;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
		// 012345678910, 길이=11
		// indexof
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : " + index);

		index = s1.indexOf("Sun");
		System.out.println("문자열 Sun의 위치 : " + index);

		index = s1.lastIndexOf('n');
		System.out.println("맨 마지막 문자 n의 위치 : " + index);

		char c = s1.charAt(index);
		System.out.println(index + "번에 담긴 문자 추출 : " + c);
		
		index = s1.indexOf('S');
		String str = s1.substring(index);
		//전달된 인덱스부터 마지막 인덱스까지 추출
		System.out.println("대문자 S부터 끝까지 잘라내기 : " + s1.substring(index));
		
		//begin index 부터 end index"전까지" 문자열 추출
		str = s1.substring(index, index+3);
		System.out.println("대문자 S로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		//구분자를 이용하여 문자열을 잘라냄	//공백없이 사용하면 빈문자열로 char문자 하나하나 잘라내게됨 // String에 null을 넣을경우 객체 생성 X
		String[] array = s1.split("");
		for (int i = 0; i < array.length; i++) {
			System.out.println("array["+i+"]: "+array[i]);
		}
	}
}
