package kr.s11.array;

import java.util.Scanner;

public class ScoreMain {
	/*
	 * [실습]
	 * 1.배열 생성(길이는 4)
	 * 2.Score 객체를 생성하고 초기화
	 * 3.객체 저장된 정보를 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Score[] score = new Score[4];
		
		// Score객체를 4개 생성해서 배열에 저장
		for (int i = 0; i < score.length; i++) 
			score[i] = new Score(); 
		
		//각 4명의 성적 정보를 입력 받아서 객체에 저장하고 객체를 배열에 저장함
		for (int i = 0; i < score.length; i++) {
			System.out.print("이름 : ");
			score[i].setName(sc.next());
			System.out.print("국어 : ");
			score[i].setKorean(sc.nextInt());
			System.out.print("영어 : ");
			score[i].setEnglish(sc.nextInt());
			System.out.print("수학 : ");
			score[i].setMath(sc.nextInt());
			System.out.println();
		}
		/*
		for (int i = 0; i < score.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int korean = sc.nextInt();
			System.out.print("영어 : ");
			int english = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			score[i] = new Score(name,korean,english,math);
			System.out.println();
		}
		*/
		System.out.println("\n------------------------------------------------------------------------------------------------------");
		
		//출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("이름 = %s,\t",score[i].getName());
			System.out.printf("국어 = %d,\t",score[i].getKorean());
			System.out.printf("영어 = %d,\t",score[i].getEnglish());
			System.out.printf("수학 = %d,\t",score[i].getMath());
			System.out.printf("총점 = %d,\t",score[i].makeSum());
			System.out.printf("평균 = %d,\t",score[i].makeAvg());
			System.out.printf("등급 = %c%n",score[i].makeGrade(score[i].makeAvg()));
		}
		
		
		sc.close();
	} // end of main()
}
