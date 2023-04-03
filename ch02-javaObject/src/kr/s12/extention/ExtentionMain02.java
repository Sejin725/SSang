package kr.s12.extention;

//부모클래스
class People{
	public void eat() {
		System.out.println("식사하다.");
	}
}
//자식클래스에 부모클래스를 상속시킴
class Student extends People {
	public void study() {
		System.out.println("공부하다.");
	}
}

public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		People p = new People();
		s.eat(); //People의 메서드를 상속 받아서 호출 가능
		p.eat(); 
		s.study(); //Student의 메서드
		//p.study(); // Student의 메서드 이므로 사용이 불가능하다.
		System.out.println(s.toString()); // Object의 메서드를 상속받아서 호출 가능
	}
}
