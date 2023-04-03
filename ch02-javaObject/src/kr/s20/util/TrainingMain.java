package kr.s20.util;

import java.util.Random;
import java.util.Scanner;

public class TrainingMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 가위바위보 게임
		 * [입력 예시]
		 * 가위바위보 입력(0.가위, 1.바위, 2.보) : 1
		 * 
		 * [출력 예시]
		 * -> 컴퓨터 : 가위, 사람 : 바위
		 * 결과 : 사람 승
		 */
		Scanner input = new Scanner(System.in);
		String[] item = {"가위", "바위", "보"};
		Random r = new Random();
		while (true) {
			System.out.println("------------------");
			System.out.println("1.게임하기 | 2.종료하기");
			System.out.println("------------------");
			System.out.print("메뉴 >");
			int num = input.nextInt();
			if (num == 1) {
				System.out.print("가위바위보 입력(0.가위, 1.바위, 2.보) : ");
				int pp = input.nextInt();
				if (pp < 0 || pp > 2) { // 휴먼 에러 방지
					System.out.println("잘못 입력했습니다.");
					continue;
				}
				int com = r.nextInt(3);
				// 또는 int com = (int)(Math.random()*3);
				
				// TeacherRCPgame(pp,com,item);
				// int result = com - pp;		-> 0일떄 무승부, -1또는2 사용자 승, -2또는1 컴 승
				
				RCPgame(pp,com,item);
			}else if (num == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}else
				System.out.println("잘못 입력했습니다.");
			
		} // end of while---- 전체 반복문
		
		input.close();
	} // end of main

	private static void TeacherRCPgame(int pp, int com, String[] item) {
		int result = com-pp;
		System.out.println("-> 컴퓨터 : "+item[com]+", 사람 : "+item[pp]);
		if (result==0) {
			System.out.println("결과 : 비겼습니다.");
		}else if( result==-1 || result==2) {
			HumanWin();
		}else {
			ComWin();
		}
	} // end of TeacherRCPgame()

	private static void RCPgame(int pp, int com, String[] item) {
		System.out.println("-> 컴퓨터 : "+item[com]+", 사람 : "+item[pp]);
		if (pp==com) {
			System.out.println("결과 : 비겼습니다.");
			//비겼습니다.
		}else {
			switch (pp) {
			case 0:
				if (com == 1) 
					ComWin();
				else 
					HumanWin();
				break;
			case 1:
				if (com == 0) 
					HumanWin();
				else
					ComWin();
				break;
			case 2:
				if (com == 0) 
					ComWin();
				else
					HumanWin();
				break;
			}
		}
	} // end of RCPgame()
	
	private static void HumanWin() {
		System.out.println("결과 : 사람 승");
	}
	private static void ComWin() {
		System.out.println("결과 : 컴퓨터 승");
	}
}
