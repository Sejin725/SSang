package kr.s03.operation;

import java.util.Scanner;

public class TrainingMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재 연도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지 않았으면 -1)
		 * 
		 * [입력 예시]
		 * 출생연도 입력 : 2000
		 * 월 입력 : 3
		 * 일 입력 : 12
		 * 
		 * [출력 예시]
		 * 만 나이는 22
		 * 
		 */
		//현재 날짜 정보
		int thisYear = 2023;
		int thisMonth = 3;
		int thisDate = 21;
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int uYear, uMonth, uDate, age, flag;
		
		do {
			System.out.print("출생연도 입력 : ");
			uYear = sc.nextInt();
		} while (uYear > 2023 || uYear <= 0);
		
		do {
			System.out.print("월 입력 : ");
			uMonth = sc.nextInt();
		} while (uMonth > 12 || uMonth <= 0);
		
		do {
			System.out.print("일 입력 : ");
			uDate = sc.nextInt();
		} while (uDate > 31 || uDate <= 0);
		
		if (thisMonth > uMonth ) {
			flag = 0;
		}else if(thisMonth == uMonth && thisDate >= uDate){
			flag = 0;
		}else
			flag = 1;
		
		age = (thisYear - uYear) - flag;
		
		
		*/
		
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		System.out.print("일 입력 : ");
		int day = sc.nextInt();
		
		// 현재 연도와 태어난 연도 연산
		int age = thisYear - year;
		
		// 현재 월과 태어난 월을 비교
		if (thisMonth < month) { //예 10 < 11
			age--; //age-=1
		}else if (thisMonth == month && thisDate < day ) {
			// 현재 월과 태어난 월이 같으면 일 비교
			age--;
		}
		
		System.out.println("만 나이 는 "+age);
		
		
		sc.close();
	}
}
