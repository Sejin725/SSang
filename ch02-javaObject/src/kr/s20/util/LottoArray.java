package kr.s20.util;

import java.util.Arrays;
import java.util.Random;

public class LottoArray {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또프로그램 제작
		 * 배열을 생성하고
		 * 1~45 숫자 중 중복되지 않은 6개 숫자를 생성해서 배열에 저장
		 * 난수 발생 : Math.random(), Random 클래스 활용
		 * 
		 */
		//로또 번호를 저장할 배열 생성
		int[] lotto = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					//1번에서 만들어진 숫자를 인덱스 0부터 i전까지 루프를 돌면서 대조
					i--;
					break;
				}
			}
		}

		// 오름차순(작은 수가 앞에 큰 수가 뒤에)으로 정렬
		Arrays.sort(lotto);
		System.out.print("현재 로또 번호 : ");
		for (int j = 0; j < lotto.length; j++) {
			if (j==lotto.length-1)
				System.out.print(lotto[j]);
			else
				System.out.print(lotto[j]+", ");
		}
		
	} // end of main
}
