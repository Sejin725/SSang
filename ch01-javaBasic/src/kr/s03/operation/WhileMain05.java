package kr.s03.operation;

import java.util.Scanner;

public class WhileMain05 {
	public static void main(String[] args) {
		System.out.println("===while문===");
		Scanner sc = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		System.out.print("누적할 정수 데이터 입력 : ");
		while ((a = sc.nextInt()) != 0) {
			total += a;//누적
			System.out.print("누적할 정수 데이터 입력 : ");
		}
		
		System.out.println("누적정수 : " + total);
		sc.close();
	}
}
