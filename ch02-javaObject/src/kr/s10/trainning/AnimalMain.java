package kr.s10.trainning;

import java.util.Scanner;

public class AnimalMain {
	/*
	 * [실습]
	 * 1.인자가 있는 생성자를 이용해서 객체 생성
	 * 2.정보 출력 (이름, 나이, 비행여부)
	 * 3.인자가 없는 생성자를 이용해서 객체 생성
	 * 4.정보 저장(이름, 나이, 비행여부)
	 * 5.정보 출력 (이름, 나이, 비행여부)
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Animal a1 = new Animal("비둘기", 2, true);
		//a1.info();
		System.out.println("이름 = " + a1.getName());
		System.out.println("나이 = " + a1.getAge());
		System.out.println("비행 여부 : " + printFly(a1.isFly()));
		/*
		if (a1.isFly()) 
			System.out.println("비행여부 = 가능");
		else 
			System.out.println("비행여부 = 불가능");
		*/
		System.out.println("\n-------------------");
		
		Animal a2 = new Animal();
		System.out.print("이름 : ");
		a2.setName(input.nextLine());
		
		System.out.print("나이 : ");
		a2.setAge(input.nextInt());
		
		System.out.print("비행여부 : ");
		a2.setFly(input.nextBoolean());
		
		System.out.println("이름 = " + a2.getName());
		System.out.println("나이 = " + a2.getAge());
		System.out.println("비행 여부 : " + printFly(a2.isFly()));
		/*
		if (a2.isFly()) 
			System.out.println("비행여부 = 가능");
		else 
			System.out.println("비행여부 = 불가능");
			*/
		input.close();
	}
	
	private static String printFly(boolean fly) {
		return fly ? "가능" : "불가능";
	}
}
