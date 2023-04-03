package kr.s03.operation;

import java.util.Scanner;

public class WhileMain06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		
		
		while (true) {
			System.out.print("누적할 정수 입력 : ");
			a = sc.nextInt();
			if (a == 0) 
				break;
			
			total += a;
		}
		System.out.println("total = " + total);
		
		sc.close();
	}
}
