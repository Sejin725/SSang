package kr.s03.operation;

import java.util.Scanner;

public class SwitchMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 두 개의 정수와 연산자를 입력한 후 연산의 결과를 출력하시오.
		 * 
		 * [입력 예시]
		 * 첫번째 수:10
		 * 연산자 입력:+ (input.next())
		 * 두번째 수:20
		 * 
		 * [출력 예시]
		 * 10 + 20 = 30
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		int a = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String b = sc.next();
		
		System.out.print("두번째 수 : ");
		int c = sc.nextInt();
		
		int result = 0;

		switch (b) {
		case "+":
			result = a + c ;
			break;
		case "-":
			result = a - c ;
			break;
		case "*":
			result = a * c ;
			break;
		case "/":
			if (c != 0) {
				result = a / c ;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			break;
		case "%":
			if (c != 0) {
				result = a % c ;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			break;
		default:
			System.out.println("잘못된 연산자 입력");
			System.exit(0);
			break;
		}
		System.out.println();// 단순 줄바꿈
		/*
		if (b.equals("/")) {
			System.out.printf("%d %s %d = %d 입력체크",a,b,c,result);
		}
		*/
		System.out.printf("%d %s %d = %d",a,b,c,result);	
		
		
		sc.close();
	}
}
