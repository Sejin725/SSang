package kr.s01.basic;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Long A,B,C;
		Scanner sc = new Scanner(System.in);
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		System.out.print(A+B+C);
		sc.close();
	}
}
