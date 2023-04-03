package kr.s03.method;

import java.util.Scanner;

public class MethodMain03 {
	public void sumOf(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("모든 요소의 합은 " + sum + " 입니다.");
	}
	public int sOf(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 배열 요소의 수를 입력받아서 배열 a를 생성 및 정의함
		 * 입력받은 정수를 배열 a에 저장하고
		 * 배열 a가 가진 모든 요소의 합을 구하는 sumOf() 메서드를 정의하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		
		//입력을 받아 배열 생성
		int[] x = new int[sc.nextInt()];
		
		//배열에 요소 입력
		for (int i = 0; i < x.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			x[i] = sc.nextInt();
		}
		
		//객체 선언 및 생성
		MethodMain03 m = new MethodMain03();
		//메서드 호출
		m.sumOf(x);
		
		sc.close();
	}
}
