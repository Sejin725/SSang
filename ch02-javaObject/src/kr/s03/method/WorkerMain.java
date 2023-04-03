package kr.s03.method;

import java.util.Scanner;

class Worker{
	String name;
	int money;
	int balance;
	
	public void work() {
		money += 1000;
	}
	public void deposite() {
		balance += money;
		money = 0;
	}
}

public class WorkerMain {
	/*
	 * [실습]
	 * Worker
	 * 1)멤버변수 : 직원 이름(name), 급여(money), 계좌 잔고(balance)
	 * 2)멤버메서드 : work(실행하면 money에 1000원 누적)
	 * 			   deposite(실행하면 money의 돈을 balance에 누적시키고 money는 0으로 처리)
	 * 
	 * WorkerMain의 main
	 * 1)Worker 객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일하는데 번 돈이 3000원일 떄마다 계좌에 저축
	 * 4)직원이름, 현재 계좌에 입급되지 않고 남아있는 급여(money), 계좌 잔고(balance)를 출력하시오.
	 * 
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Worker w = new Worker();
		System.out.print("직원의 이름 : ");
		w.name = input.nextLine();
		
		for (int i = 0; i < 10; i++) {
			w.work();
			if (w.money == 3000) {
				w.deposite();
			}
		}
		
		System.out.println("직원의 이름 = " + w.name);
		System.out.printf("남아있는 급여 = %,d%n", w.money);
		System.out.printf("계좌 잔고 = %,d%n", w.balance);
		input.close();
	}
}
