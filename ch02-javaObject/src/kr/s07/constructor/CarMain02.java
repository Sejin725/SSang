package kr.s07.constructor;

class Car2 {
	String color;
	String gearType;
	int door;

	public Car2() {
	}

	public Car2(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

public class CarMain02 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car2 c1 = new Car2();
		//객체의 멤버변수에 데이터 할당
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("------------------");
		
		//객체 선언, 생성, 변수초기화
		Car2 c2 = new Car2("blue","auto",2);
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
		System.out.println("------------------");
		
	}
}
