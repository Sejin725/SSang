package kr.s21.abs;

//추상클래스
abstract class A2{
	private int x;
	//추상메서드(미구현된 메서드)
	public abstract void abc();
	//일반메서드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
}
//자식클래스
class B2 extends A2{
	//부모클래스의 추상메서드(미구현된 메서드)를 구현
	//추상메서드를 구현하지 않으면 객체 생성 불가 - @Override는 권장사항
	@Override
	public void abc() {
		System.out.println("abc");
	}
}
public class AbstractMain02 {
	public static void main(String[] args) {
		
		B2 bp = new B2();
		bp.abc();
		
	} // end of main
}
