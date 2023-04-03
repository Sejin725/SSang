package kr.s03.operation;

public class ForMain01 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("------------------");
		//수행문이 한 줄일 경우 {} 중괄호 생략이 가능함
		for (int i = 1; i <=5; i++)
			System.out.println(i);
		
		
		System.out.println("프로그램 끝 ");
	}
}
