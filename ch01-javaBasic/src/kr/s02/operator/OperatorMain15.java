package kr.s02.operator;

import java.util.Scanner;

public class OperatorMain15 {
	public static void main(String[] args) {
		//대입연산자를 사용하는 은행 프로그램
		int balance = 0;//잔고
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("예금액> ");
		//누적
		balance += sc.nextInt();
		
		System.out.printf("잔고 : %,d원%n" , balance);
		
		System.out.print("출금액> ");
		//차감
		balance -= sc.nextInt();
		
		System.out.printf("잔고 : %,d원%n" , balance);
		
		
		sc.close();
	}
}
