package kr.s24.interfacetest;

interface InterSub {
	// 추상메서드
	public void make();
}

class InterCenter implements InterSub {
	public void make() {
		System.out.println("make메서드");
	}

	public void play() {
		System.out.println("play메서드");
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		InterCenter ic = new InterCenter();
		ic.make();
		ic.play();
		
		System.out.println("---------------------------");
		InterSub is = ic;	//클래스타입 -> 인터페이스타입 형변환 (업캐스팅이 아님)
							//자동형변환 진행됨
		is.make();
		System.out.println("---------------------------");
		//호출 범위를 벗어나 호출 불가
		//is.play();
		
		//인터페이스타입 -> 클래스타입 형변환
		//명시적으로 형변환
		InterCenter ic2 = (InterCenter)is;
		
		ic2.make();
		ic2.play();
		
		
		
		
	} // end of main
}
