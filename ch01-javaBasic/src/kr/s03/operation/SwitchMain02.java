package kr.s03.operation;

import java.util.Scanner;

public class SwitchMain02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("===switch문===");
		
		System.out.print("계절 입력 ==> ");
		//next() 봄 여름 -> "봄" 만 반환
		//nextLine() 봄 여름 -> "봄 여름" 반환
		String season = input.nextLine();
		
		switch (season) {
		case "봄":
			System.out.println("꽃이 피는 계절");
			break;
		case "여름":
			System.out.println("뜨거운 태양의 계절");
			break;
		case "가을":
			System.out.println("산들바람이 부는 계절");
			break;
		case "겨울":
			System.out.println("눈이 내리는 계절");
			break;
		default:
			System.out.println("없는 계절");
			break;
		}
		
		input.close();
	}
}
