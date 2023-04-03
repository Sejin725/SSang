package kr.s03.operation;

import java.util.Scanner;

public class IfMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 하나를 입력하여 짝수면 10을 더하고, 홀수이면 20을 더해서
		 * 결과값을 출력하시오.
		 * 
		 * [입력 예시]
		 * 정수 하나 입력:5
		 * 
		 * [출력 예시]
		 * 결과 : 25
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int a = sc.nextInt();
		
		if (a%2 == 0) {
			a+=10;
		}else {
			a+=20;
		}
		System.out.printf("결과 : %d%n", a);
		sc.close();
	}
}
