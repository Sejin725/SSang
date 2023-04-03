package kr.s05.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while (hs.size()<6) {
			//난수 발생 1 ~ 45
			int num = (int)(Math.random()*45);
			//HashSet은 중복값 불허하므로 그냥 넣어도 됨
			hs.add(num);
		}
		
		//오름차순으로 정렬		(HashSet은 List타입이 아니여서 정렬이 불가능하다.)
		//Collections.sort(hs);
		//따라서 HashSet을 ArrayList로 변환을 한다.
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		//정렬
		Collections.sort(list);
		
		
		for (int num : list) {
			System.out.println(num+"\t");
		}
		
		
	}	//end of main
}
