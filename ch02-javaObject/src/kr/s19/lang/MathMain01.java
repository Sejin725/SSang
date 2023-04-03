package kr.s19.lang;

public class MathMain01 {
	public static void main(String[] args) {
		//절대값
		int a = Math.abs(-10);
		System.out.println("절대값 : " + a);
		
		//올림
		double b = Math.ceil(3.3);
		System.out.println("올림값 : " + b);
		
		//버림(절삭)
		double c = Math.floor(3.7);
		System.out.println("절삭 : " + c);
		
		//반올림
		int d = Math.round(3.7f);
		System.out.println("반올림 : " + d);
		
		//최대값
		int e = Math.max(3, 5);
		System.out.println("최대값 : " + e);
		
		//최소값
		int f = Math.min(4, 7);
		System.out.println("최소값 : " + f);
		
		
	} // end of main
}
