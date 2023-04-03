package kr.s10.trainning;

import java.util.Scanner;

class Coffee {
	int amount; // 누적금액
	int change = 1000; // 거스름돈

	int coffee = 10; // 초기 커피양
	int cream = 10; // 초기 크림양
	int suger = 10; // 초기 설탕양

	public void cfMenu() {
		System.out.println("=====================================");
		System.out.println("메뉴 - 1.커피마시기 | 2.커피정보보기 | 3.종료 |");
		System.out.println("=====================================");
		System.out.print("메뉴 선택 >>> ");
	}

	public void sellCoffee(int money, int cnt) {
		coffee -= cnt * 5;
		cream -= cnt * 3;
		suger -= cnt * 1;
		change -= (money - cnt * 300);
		amount += (cnt * 300);
		System.out.println("거스름돈 : " + (money - cnt * 300));
	}
	
	public void info() {
		System.out.println("커피양 : " + coffee);
		System.out.println("프림양 : " + cream);
		System.out.println("설탕양 : " + suger);
		System.out.printf("거스름돈 보유금액 : %,d원%n", change);
		System.out.printf("누적금액 : %,d원%n", amount);
	}

}

public class CoffeeMain {
	/*
	 * [실습] 메뉴 - 1.커피마시기, 2.커피정보보기, 3.종료 1)커피마시기
	 * 
	 * [입력예시] 동전을 넣으세요 (300원): 구매 수량 입력:
	 * 
	 * (조건체크) 입력하는 동전과 구매수량은 0이하 X 거스름돈이 부족한지 여부 커피가 부족한지 여부 체크 프림이 부족한지 여부 체크 설탕이
	 * 부족한지 여부 체크
	 * 
	 * 
	 * (연산) 커피차감(5) 프림차감(3) 설탕차감(1) 거스름돈 차감 투입한 금액 누적
	 * 
	 * [출력 예시] 거스름 돈 : ** 커피 2잔 준비되었습니다. or 재료가 모자릅니다. -> 종료 or 거스름돈이 모자릅니다. -> 종료
	 * 
	 * 2.커피정보보기 커피양 : * 프림양 : * 설탕양 : * 거스름돈 보유금액 : *원 누적금액 : *원
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coffee cf = new Coffee();

		while (true) {
			cf.cfMenu();
			int a = sc.nextInt();
			if (a == 1) { // 1번 메뉴
				/*
				// 초기화
				int coin;
				int cnt;
				while (true) { // 투입금액
					System.out.print("동전을 넣으세요 (300원):");
					coin = sc.nextInt();
					if (coin <= 299)
						System.out.println("투입 금액이 300원 이상 필요합니다.");
					else
						break;
				}
				while (true) { // 구매 수량
					System.out.print("구매 수량 입력:");
					cnt = sc.nextInt();
					if (cnt <= 0)
						System.out.println("구매 수량은 0 이상이여야 합니다.");
					else if(cnt * 300 > coin) 
						System.out.println("투입 금액이 모자릅니다.");
					else
						break;
				}
				if (cf.change < coin - cnt * 300) { // 거스름돈 비교
					System.out.println("판매 중지");
					break;
				}
				if (cf.coffee < cnt*5 || cf.cream < cnt*3 || cf.suger < cnt*1) {
					System.out.println("재료가 모자라서 판매가 불가능합니다.");
					break;
				}
				
				 */
				System.out.print("동전을 넣으세요 (300원):");
				int coin = sc.nextInt();
				
				System.out.print("구매 수량 입력:");
				int cnt = sc.nextInt();
				//수량 오입력
				if(coin<=0 || cnt<=0) {
					System.out.println("0이하의 숫자는 입력 불가");
					continue;
				}
				//투입금액 부족
				if (coin < cnt*300) {
					System.out.println("동전이 부족합니다.");
					continue;
				}
				//거스름돈이 부족함
				if (coin-cnt*300 > cf.change) {
					System.out.println("거스름돈이 부족합니다.");
					continue;
				}
				//커피가 부족함
				if (cf.coffee < cnt*5) {
					System.out.println("커피가 부족합니다.");
					continue;
				}
				//프림이 부족함
				if (cf.cream < cnt*3) {
					System.out.println("프림이 부족합니다.");
					continue;
				}
				//설탕이 부족함
				if (cf.suger < cnt*1) {
					System.out.println("설탕이 부족합니다.");
					continue;
				}
				
				//연산
				//커피 차감
				
				cf.sellCoffee(coin,cnt);
				System.out.println("커피 " + cnt + "잔 준비되었습니다.");
			} else if (a == 2) { // 2번 메뉴
				cf.info();
			} else if (a == 3 || cf.change <= 200) { // 3번 메뉴
				break;
			}
			System.out.println();
		}

		sc.close();
	}
}
