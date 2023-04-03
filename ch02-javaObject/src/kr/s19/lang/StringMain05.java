package kr.s19.lang;

public class StringMain05 {
	public static void main(String[] args) {
		String str = "abcMDye-4W?EWzz";
		String result = "";
		
		// String -> char6[]
		for (char c : str.toCharArray()) {
			//대문자이면 true, 소문자이면 false
			if (Character.isUpperCase(c)) {//대문자
				//소문자로 변환
				result += Character.toLowerCase(c);
				
			//소문자이면 true, 대문자이면 false
			}else if (Character.isLowerCase(c)) {
				//대문자로 변환
				result += Character.toUpperCase(c);
			}else {
				result += c;
			}
		}// end of foreach
		System.out.println(result);
	}// end of main
}
