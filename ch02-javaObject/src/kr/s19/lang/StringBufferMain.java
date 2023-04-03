package kr.s19.lang;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다!!");
		System.out.println("1:"+sb);
		
		//문자 추가
		sb.insert(2, "이");
		System.out.println("2:"+sb);
		
		//기존 문자열 뒤에 새로운 문자열을 추가
		sb.append("가을은 ");
		System.out.println("3:"+sb);
		
		sb.append("시원하다.");
		System.out.println("4:"+sb);
		
		//기존 문자열의 특정 문자열을 새로운 문자열로 대체
		//(범위는 시작 index부터 끝 index전까지)
		sb.replace(0,  3, "여행가자!!");
		System.out.println("5:"+sb);
		
		//index를 지정해서 해당 index의 문자를 삭제
		sb.deleteCharAt(0);
		System.out.println("6:"+sb);
		
		//시작 index와 끝 index를 지정해서 문자열을 삭제
		sb.delete(0, 3);
		System.out.println("7:"+sb);
		
		//StringBuffer -> String 변환
		String str = sb.toString();
		System.out.println("str:"+str);
		
	} // end of main
}
