package kr.s07.constructor;

class Car {
	String color;
	String gearType;
	int door;

	// 생성자(생략 가능하고 생략하면 컴파일시 자동생성)
	// 객체 생성시 호출되고 멤버변수를 초기화하는 역할
	public Car() {
	}
}

public class CarMain01 {
	public static void main(String[] args) {
		// 객체 생성시 생성자는 처음에 한 번만 실행되고 객체 생성 이후에는 호출 불가능
		Car c1 = new Car();
		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("-----------");
		
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;

		System.out.println(c1.color + "," + c1.gearType + "," + c1.door);
		System.out.println("-----------");
		
		
		Car c2 = new Car();
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
		System.out.println("-----------");
		
		c2.color="red";
		c2.gearType="manual";
		c2.door=5;
		
		System.out.println(c2.color + "," + c2.gearType + "," + c2.door);
		System.out.println("-----------");
	}
}
