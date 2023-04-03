package kr.s20.util;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300,400";
								//문자열,구분자
		StringTokenizer st = new StringTokenizer(source, ",");
		
		//반복문을 이용해서 구분자로 잘라낸 문자열을 출력함
		while (st.hasMoreTokens()) { // 잘라낸 문자열이 있는지 없는지 검증
			System.out.println(st.nextToken());
		}
		
		
		
		
	}//end of main
}
