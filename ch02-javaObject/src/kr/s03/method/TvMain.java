package kr.s03.method;

class Tv{
	//멤버변수 (Tv의 속성)
	boolean power;	//전원상태 (on/off)
	int channel;	//채널
	
	//멤버메서드 (Tv의 동작)
	public void isPower() {//Tv를 켜거나 끄는 기능
		power = !power;
	}
	
	public void channelUp() {//Tv의 채널을 높이는 기능
		++channel;
	}
	
	public void channelDown(){//Tv의 채널을 낮추는 기능
		--channel;
	}
}


public class TvMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Tv t = new Tv();
		t.isPower();//false -> true
		
		System.out.println("Tv 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		System.out.println("=========================");
		
		t.channel = 7; // 채널변경
		
		System.out.println("첫번째 변경된 채널 : " + t.channel);
		System.out.println("=========================");
		
		t.channelDown();
		
		System.out.println("두번째 변경된 채널 : " + t.channel);
		
		t.isPower(); //true -> false
		
		System.out.println("Tv 실행 여부 : " + t.power);
	}
}
