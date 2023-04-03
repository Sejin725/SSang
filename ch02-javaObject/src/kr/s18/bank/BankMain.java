package kr.s18.bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1.일반 계좌 생성
		 * 2.입금하기
		 * 3.출금하기
		 * 4.계좌정보 출력
		 */
		Scanner input = new Scanner(System.in);
		
		//BankAccount ba = new BankAccount("453-122", "1234", "홍길동", 50000);
		BankAccount ba2 = new MinusAccount("488-998", "9999", "장영실", 50000, 500000);
		
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("| 1.입금 | 2.출금 | 3.계좌정보확인 | 4.종료 |");
			System.out.println("-------------------------------------");
			int a = input.nextInt();
			if (a==1) {
				System.out.print("입금할 금액을 입력해주세요 >>> ");
				ba2.deposit(input.nextInt());
			}else if (a==2) {
				System.out.print("출금할 금액을 입력해주세요 >>> ");
				ba2.withdraw(input.nextInt());
			}else if (a==3) {
				ba2.printAccount();
			}else if (a==4) {
				System.out.println("은행 시스템 종료");
				break;
			}
			System.out.println();
		}// end of while
		
		
		input.close();	
	} // end of main
}
