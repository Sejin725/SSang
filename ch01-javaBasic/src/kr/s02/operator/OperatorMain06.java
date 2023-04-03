package kr.s02.operator;


public class OperatorMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 키보드에서 입력한 정수값에 마지막 자리수를 제외한 값과 마지막 자리수를 표시
		 * (힌트)123을 입력하면 마지막 자릿수를 제외한 값은 12이고 마지막 자릿수는 3이 됨
		 * 
		 * [출력 예시]
		 * 마지막 자릿수를 제외한 값 : 
		 * 마지막 자릿수 : 
		 * 
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		/*
		System.out.print("값 입력 : ");
		int data = sc.nextInt();
		int trim = data/10;
		int last = data%10;
		
		System.out.println("마지막 자릿수를 제외한 값 : " + trim);
		System.out.println("마지막 자릿수 : " + last);
		*/
		
		
		System.out.print("값 입력 : ");
		
		String dd = sc.next();
		
		char[] chr = {};
		chr = dd.toCharArray();
		System.out.print("마지막 자릿수를 제외한 값 : ");
		if (chr.length!=1) {
			for (int i = 0; i < chr.length-1; i++) {
				if (i==chr.length-2) {
					System.out.println(chr[i]);
				}else {
					System.out.print(chr[i]);	
				}
			}
		}else
			System.out.println(chr[0]);
		
		System.out.println("마지막 자릿수 : " + chr[(chr.length-1)]);
		
		sc.close();
	}
}
