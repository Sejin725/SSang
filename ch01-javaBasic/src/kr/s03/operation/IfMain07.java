package kr.s03.operation;

import java.util.Scanner;

public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 두개를 입력 받아서 변수에 저장하고 두 값 중 최대값과 최소값을 구하여
		 * 최대값과 최소값을 출력하시오.
		 * (단, 같은 숫자를 입력하면 "두 수는 같습니다.")
		 * [입력예시]
		 * 첫번째 정수 입력 : 2
		 * 두번째 정수 입력 : 3
		 * 
		 * [출력예시]
		 * 최대값 : 3
		 * 최소값 : 2
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 정수 입력 : ");
		int one = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int two = sc.nextInt();
		
		if (one > two) {
			System.out.printf("최대값 : %d%n최소값 : %d%n",one,two);
		}else if (two > one) {
			System.out.printf("최대값 : %d%n최소값 : %d%n",two,one);
		}else if (one==two) {
			System.out.println("두 수는 같습니다.");
		}
		
		
		sc.close();
	}
}
