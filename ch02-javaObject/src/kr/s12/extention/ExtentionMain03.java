package kr.s12.extention;

//부모클래스
class A{
	int x = 100;
	private int y = 200;
	public int getY() {
		return y;
	}
}
//자식클래스에 부모클래스 상속
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		
		System.out.println(bp.x);
		//private 멤버변수는 같은 클래스내에서만 호출이가능
		//System.out.println(bp.y);
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}
