package kr.s02.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또프로그램 제작	[ArrayList 사용]
		 * 1~45 사이의 중복값이 존재하지 않는 난수 6개 생성
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		while (list.size() < 6) {
			int ran = r.nextInt(45)+1;
			//중복값 체크
			if (!list.contains(ran)) {
				list.add(ran);
			}
		}
		System.out.println(list);
		
		//오름차순 정렬
		Collections.sort(list);
		
		for (int num : list) {
			System.out.print(num + "\t");
		}
		
	}	//end of main
}
