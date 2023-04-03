package kr.s22.finaltest;

class Me{
	int var=100;
	//메서드에 final을 지정하면 자식클래스에서 메서드 오버라이딩을 할 수 없음
	public final void setVar(int var) {
		this.var = var;
	}
}
public class FinalMain02 extends Me {
	/*
	 * @Override public void setVar(int var) { this.var = var + 100; }
	 */
	public static void main(String[] args) {
		
	}
}
