package kr.s02.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("사과");
		
		//인덱스 탐색
		int index1 = list.indexOf("사과");		//앞에서부터 찾아서 1을 반환함
		System.out.println("첫번째 사과 : " + index1);
		int index2 = list.lastIndexOf("사과");
		System.out.println("마지막 사과 : " + index2);
		int index3 = list.lastIndexOf("망고");
		System.out.println("망고 : " + index3);
		
		//요소의 목록 출력
		System.out.println(list);
		System.out.println("-----------------------");
		
		//정렬(사전에 명시된 순서로 정렬)
		Collections.sort(list);
		
		System.out.println(list);
		System.out.println("-----------------------");
		
		//역순으로 정렬
		Collections.reverse(list);
		
		System.out.println(list);
		System.out.println("-----------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(10);
		list2.add(100);
		list2.add(15);
		list2.add(2);
		list2.add(40);

		//오름차순 정렬
		Collections.sort(list2);
		
		System.out.println(list2);
		System.out.println("-----------------------");
		
		Collections.reverse(list2);
		
		System.out.println(list2);
		System.out.println("-----------------------");
	}	//end of main
}
