package kr.s03.operation;

import java.util.Scanner;

public class WhileMain07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 은행 프로그램
		int balance = 0; // 잔고
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고확인 | 4.종료");
			System.out.println("----------------------------------");
			
			System.out.print("메뉴 선택> ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.print("예금액 > ");
				balance += sc.nextInt();
			}else if (a == 2) {
				System.out.print("출금액 > ");
				balance -= sc.nextInt();
			}else if (a == 3) {
				System.out.printf("현재 잔액은 : %,d원 입니다." ,balance);
			}else if (a == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			System.out.println("\n\n");
		}
		
		sc.close();
	}
}
