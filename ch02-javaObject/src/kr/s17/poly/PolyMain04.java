package kr.s17.poly;

//부모클래스
class Product{
	int price;		//제품가격
	int bonusPoint;	//제품 구매시 제공되는 보너스 점수
	//생성자
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	public String getName() {
		return "상품";
	}
} // end of Product ----------------------------
class TV extends Product{
	public TV() {
		super(100);
	}
	//메서드 오버라이딩
	@Override
	public String getName() {
		return "TV";
	}
} // end of TV ----------------------------

class Computer extends Product{
	//부모클래스의 인자가 있는 생성자를 호출
	public Computer() {
		super(200);
	}
	//메서드 오버라이딩
	@Override
	public String getName() {
		return "Computer";
	}
} // end of Computer ----------------------
class Audio extends Product{
	public Audio() {
		super(300);
	}
	@Override
	public String getName() {
		return "Audio";
	}
} // end of Audio ----------------------------

class Buyer {
	private int money = 1000;	//구매자 보유 금액1
	private int bonusPoint = 0;
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p.getName() + "을(를) 구입하셧습니다.");
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + bonusPoint + "점입니다.");
	}
}

public class PolyMain04 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		Audio au = new Audio();
		//구매자가 TV를 구매
		b.buy(tv);	//Tv -> Product로 형변환
		//구매자가 Computer를 구매
		b.buy(com);	//Computer -> Product로 형변환
		//구매자가 Audio를 구매
		b.buy(au);	//Audio -> Product로 형변환
	}
}
