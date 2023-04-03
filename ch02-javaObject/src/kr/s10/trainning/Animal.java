package kr.s10.trainning;

public class Animal {
	/*
	 * [실습]
	 * Animal
	 * 멤버변수 : 이름(name), 나이(age), 비행여부(fly-bool)
	 * 멤버메서드 : Set, Get 메서드 생성
	 * 			 boolean 예) setFly, isFly
	 * 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
	 */
	
	private String name;
	private int age;
	private boolean fly;
	
	public Animal() {}
	
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <=0) {
			System.out.println("나이는 0보다 작을수 없습니다.");
		}
		this.age = age;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	public void info() {
		System.out.println("이름 = " + getName());
		System.out.println("나이 = " + getAge());
		System.out.println("비행여부 = ");
	}

}
