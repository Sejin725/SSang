package kr.spring.ch02;

public class StudentBean {
	public void study(String course) {
		System.out.println(course + "를 공부합니다.");
	}
	public void studentInfo() {
		System.out.println("이름 : " + Name);
		System.out.println("번호 : " + sNum);
	}
	private int sNum;
	private String Name;
	public int getsNum() {
		return sNum;
	}
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
