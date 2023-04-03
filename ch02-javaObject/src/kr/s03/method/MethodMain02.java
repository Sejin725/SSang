package kr.s03.method;

import java.util.Scanner;

public class MethodMain02 {
	//멤버메서드
	public int signOf(int a) {
		int result = 0;
		if (a > 0) {
			result = 1;
		}else if (a < 0) {
			result = -1;
		}
		
		return result;
	}
	 public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력한 int형 정수값이 음수이면 -1을, 0이면 0을 양수이면 1을 반환하는
		 * sighOf 메서드를 작성하시오.
		 */
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 입력 > ");
		 //객체 생성
		 MethodMain02 me = new MethodMain02();
		 //입력 값, 호출 한줄로 정리하기
		 //System.out.println(me.signOf(sc.nextInt()));
		 
		 int x = sc.nextInt();
		 int result = me.signOf(x);
		 
		 System.out.println("signOf(x)는 " + result + " 입니다.");
		 
		 sc.close();		 
	}
}
