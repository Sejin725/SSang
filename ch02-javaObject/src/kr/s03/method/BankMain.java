package kr.s03.method;

import java.util.Scanner;

class Account {
	String account_num;
	String name;
	int balance;

	public void deposite(int a) {
		if (a <= 0) {
			System.out.println("입금액은 0보다 크게 입력하세요!.");
		} else {
			balance += a;
			System.out.println("입금이 완료되었습니다.");
		}

	}

	public void withdraw(int a) {
		if (a <= 0) {
			System.out.println("출금액은 0보다 크게 입력하세요!.");
		} else {
			balance -= a;
			System.out.println("출금이 완료되었습니다.");
		}
	}

	public void printAccount() {
		System.out.println("계좌번호 : " + account_num);
		System.out.println("예금주 : " + name);
		System.out.printf("잔고 : %,d원%n", balance);
	}
}

public class BankMain {
	/*
	 * [실습] Account 클래스 생성 1)멤버변수 : 계좌번호(account_num), 예금주(name), 잔고(balance)
	 * 2)멤버메서드 : 예금하기(deposite) void : balance에 값 누적 예금 처리 후, "입금이 완료되었습니다" 출력
	 * 출금하기(withdraw) void : balance에 값 차감 출금 처리 후, "출금이 완료되었습니다" 출력 계좌정보
	 * 출력(printAccount) void : 계좌번호, 예금주, 잔고 출력
	 * 
	 * BankMain main 1)Account 생성 2)계좌 기본 정보 입력 : 계좌번호, 예금주, 잔고 (스캐너를 통해 입력)
	 * 3)while(true)형식으로 반복문 안에 메뉴 작성 (1.예금 | 2.출금 | 3.잔고 확인 | 4.종료 )
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account user = new Account();
		System.out.println("계좌 기본 정보를 입력해서 계좌를 생성합니다.");
		System.out.print("생성할 계좌번호 입력 : ");
		user.account_num = sc.nextLine();

		System.out.print("생성할 예금주명 입력 : ");
		user.name = sc.nextLine();

		System.out.print("기본잔고 입력 : ");
		user.balance = sc.nextInt();
		System.out.println("\n" + user.name + "님 계좌가 개설되었습니다.\n\n");

		while (true) {
			System.out.println("(1.예금 | 2.출금 | 3.잔고 확인 | 4.종료 )");
			int in = sc.nextInt();
			if (in == 1) {
				System.out.print("입금할 금액을 입력해주세요.");
				user.deposite(sc.nextInt());
			} else if (in == 2) {
				System.out.print("출금할 금액을 입력해주세요.");
				user.withdraw(sc.nextInt());
			} else if (in == 3) {
				user.printAccount();
			} else if (in == 4) {
				System.out.println("프로그램 종료");
				break;
			}

			System.out.println();
		}

		sc.close();
	}
}
