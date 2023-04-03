package kr.s03.operation;

public class ForMain06 {
	public static void main(String[] args) {
		System.out.println("===for문===");
		
		char c = 'a';
		for (int i = 0; i < 26; i++) {
			//'a'부터 26개의 문자를 출력
			if (i == 13) 
				System.out.println();
			System.out.print(c++ + "\t");
		}
		
		System.out.println("\n");
		
		char d = 'A';
		for (int i = 0; i < 26; i++) {
			//'A'부터 26개의 문자를 출력
			if (i == 13) 
				System.out.println();
			System.out.print(d++ + "\t");
		}
		
		System.out.println("\n");
		
		char e = '0';
		for (int i = 0; i < 10; i++) {
			//'0'부터 10개의 문자를 출력
			System.out.print(e++ + "\t");
		}
	}
}
