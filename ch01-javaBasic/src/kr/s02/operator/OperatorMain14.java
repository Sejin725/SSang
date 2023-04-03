package kr.s02.operator;

public class OperatorMain14 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * A전자 대리점에서는 그날 물건 판매액의 15%를 할인해주기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 키보드로 입력받아서 지불 금액을
		 * 출력하는 프로그램을 작성하시오.
		 * (단, 출력시에는 소수점이하는 절삭)
		 * 
		 * [입출력예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 냉장고 3대의 가격은 1,275,000원
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//문자열 입력 : input.nextLine()
		//숫자(정수) 입력 : input.nextInt()
		
		System.out.print("상품명 입력 : ");
		String name = input.nextLine();
		
		System.out.print("단가 입력 : ");
		int price = input.nextInt();
		
		System.out.print("판매 수량 입력 : ");
		int m = input.nextInt();

		int result = price*m*85/100;
		// int rere = (int)(price*m*0.85);
		// double result = price*m*0.85;

		System.out.printf("%s %d대의 가격은 %,d원%n",name,m,result);
		
		
		input.close();
	}
}
