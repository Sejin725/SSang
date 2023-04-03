package kr.s15.overriding;

//부모클래스
class Mother{
	public String getLunch() {
		return "밥";
	}
}
class Son extends Mother{
	//Mother의 getLunch() 사용
}
class Daughter extends Mother{
	@Override
	public String getLunch() {
		return "빵";
	}
}

public class OverridingMain02 {
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println("아들은 "+ s.getLunch() + "을 먹는다.");
		
		Daughter d = new Daughter();
		System.out.println("딸은 " + d.getLunch() + "을 먹는다.");
	}
}
