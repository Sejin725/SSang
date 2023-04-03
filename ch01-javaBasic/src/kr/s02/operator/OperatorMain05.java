package kr.s02.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		
		//임포트 없이 스캐너 사용하는 방법
		java.util.Scanner input= new java.util.Scanner(System.in);
		
		System.out.print("국어 : ");
		//입력된 정수를 변수에 대입
		int korean = input.nextInt();
		
		System.out.print("영어 : ");
		int english = input.nextInt();
		
		System.out.print("수학 : ");
		int math = input.nextInt();
		
		int sum = korean + english + math;
		double avg = sum/3.0;
		
		System.out.printf("국어 = %d%n", korean);
		System.out.printf("영어 = %d%n", english);
		System.out.printf("수학 = %d%n", math);
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n", avg);
		
		input.close();
	}
}
