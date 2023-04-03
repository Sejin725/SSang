package kr.s19.lang;

//s = (ch>='A') && (ch<='Z') ? "대문자임" : "소문자임";

public class StringMain04 {
	public static String change(char input) {
		char a = input;
		String result;
		if (a>='a' && a<='z') {
			result = String.valueOf(a).toUpperCase();
		}else if(a>='A' && a<='Z') {
			result = String.valueOf(a).toLowerCase();
		}else
			result = String.valueOf(a);
		
		return result;
	}
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 아래 문자열의 소문자는 대문자로, 대문자는 소문자로 변경하시오.
		 */
		String str = "abcMDye-4W?EWzz";
		String result = "";
		
		/*
		for (int i = 0; i < str.length(); i++) {
			result += change(str.charAt(i));
		}
		System.out.println(result);
		*/
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>=65 && c<=90) {//대문자
				//대문자 -> 소문자
				result += String.valueOf(c).toLowerCase();
			}else if(c>=97 && c<=122) {//소문자
				//소문자 -> 대문자
				result += String.valueOf(c).toUpperCase();
			}else {
				result += c;
			}
		}
		System.out.println(result);
	} // end of main
}
