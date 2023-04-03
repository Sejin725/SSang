package kr.s03.method;

import java.util.Scanner;

public class MethodMain04 {
	public int minOf (int[] a) {
		int result = a[a.length-1];
		for (int i = 0; i < a.length; i++) {
			//최소값 구하기
			if (result > a[i]) 
				result = a[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 배열 요소 수(사람 수)를 입력 받아서 배열 weight 생성.
		 * 입력 받은 정수를 배열 weight에 저장하고 배열 weight가 가진 모든 요소의 수 중
		 * 최소값을 구하는 minOf 메서드를 작성하시오.
		 * 
		 * [출력 예시]
		 * 가장 마른 사람의 체중 : 24kg입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수 : ");
		//체중을 저장하는 배열 생성
		int[] weight = new int[sc.nextInt()];
		
		for (int i = 0; i < weight.length; i++) {
			System.out.print((i+1)+"번째 사람의 무게 입력 : ");
			weight[i] = sc.nextInt();
		}
		
		//객체 선언 및 생성
		MethodMain04 m = new MethodMain04();
		//메서드 호출
		int min = m.minOf(weight);
		System.out.println("가장 마른 사람의 체중 : "+min+"kg입니다.");
		
		sc.close();
	}
}
