package kr.s04.array;

public class Student {
	//멤버 변수
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student student;
		//객체 생성
		student = new Student();
		
		//객체의 구성원에 데이터 저장
		//멤버 변수에 값 저장
		student.name = "홍길동";
		student.age = 20;
		
		//객체의 멤버 변수 값 출력
		System.out.println(student.name);
		System.out.println(student.age);
	}
}
