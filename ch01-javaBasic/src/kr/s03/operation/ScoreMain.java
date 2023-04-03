package kr.s03.operation;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean, english, math, sum;
		char grade;
		float avg;
		
		
		//선 처리, 후 비교
		do {
			System.out.print("국어: ");
			korean = sc.nextInt();
		} while (korean < 0 || korean > 100);
		
		do {
			System.out.print("영어: ");
			english = sc.nextInt();
		} while (english < 0 || english > 100);
		
		do {
			System.out.print("수학: ");
			math = sc.nextInt();
		} while (math < 0 || math > 100);
		
		sum = korean+english+math;
		avg = sum/3.0f;
		switch ((int)avg/10) {
		case 10:
		case 9:	
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("총점 = %d%n평균 = %.2f%n등급 = %c학점", sum, avg, grade);
		sc.close();
	}
}
