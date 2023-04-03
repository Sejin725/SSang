package kr.s18.bank;

public class MinusAccount extends BankAccount{
	/*
	 * [실습]
	 * BankAccount를 상속 받아서 마이너스 계좌의 기능을 갖는 클래스를 정의
	 * 
	 * 멤버변수 : 한도(minusLimit)
	 * 멤버메서드 : 출금(withdraw) - 재정의
	 * 			 계좌정보(printAccount) - 재정의
	 */
	private int minusLimit;
	public MinusAccount(String number, String password, String name, int balance, int minusLimit) {
		super(number, password, name, balance);
		this.minusLimit = minusLimit;
	}
	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if (-(minusLimit+balance) > balance - money) {
			System.out.println("한도를 초과하여 출금 할 수 없습니다.");
			return;
		}
		System.out.printf("%,d원이 출금되었습니다.",money);
		balance -= money;
	}
	@Override
	public void printAccount() {
		System.out.println("(신용)계좌번호 : "+number);
		System.out.println("비밀번호 : "+password);
		System.out.println("예금주 : "+name);
		System.out.printf("잔고 : %,d원\n",balance);
		System.out.printf("한도 : -%,d원",minusLimit);
	}
	
}
