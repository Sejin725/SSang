package kr.s03.operation;

import java.util.Scanner;

public class IfMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력받은 3개의 정수 중 최대값, 최소값 구하기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int c = sc.nextInt();

		int max, min;
		/*
		if (a > b  && a > c) {
			max = a;
		}else if (b > a && b > c) {
			max = b;
		}else {
			max = c;
		}
		if(a < b && a < c) {
			min = a;
		}else if(b < a && b < c) {
			min = b;
		}else {
			min = c;
		}
		*/
		
		max = a; // 조건 체크를 위한 기준값을 설정
		min = a; // 조건 체크를 위한 기준값을 설정
		
		if (b > max) max = b;
		if (c > max) max = c;
		
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.printf("최대값 : %d%n최소값 : %d%n",max,min);
		
		sc.close();
		System.out.println();
	}
}
