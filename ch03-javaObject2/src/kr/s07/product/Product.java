package kr.s07.product;

public class Product {

	private String name;	//상품명
	private String num;		//상품번호
	private String maker;	//제조사
	private int price;		//상품가격
	private int stock;		//재고

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public static void main(String[] args) {

	}// end of main
}
