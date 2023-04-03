package kr.s18.bank;

public class BankAccount {
	/*
	 * [실습]
	 * 기본 계좌
	 * 멤버변수 : 계좌번호(number), 비밀번호(password), 예금주(name), 잔고(balance)
	 * 생성자 : 인자가 있는 생성자 : "442-213 계좌가 개설되었습니다."
	 * 멤버메서드 : 
	 * 		입금(void deposit) : 0이하의 금액은 입금할 수 없습니다.
	 * 							1000원이 입금되었습니다.
	 * 		출금(void withdraw) : 0이하의 금액은 입금할 수 없습니다.
	 * 							1000원이 출금되었습니다.
	 * 		계좌정보(void printAccount) - (일반)계좌번호,비밀번호,예금주,잔고
	 */
	protected String number;
	protected String password;
	protected String name;
	protected int balance;
	//생성자
	public BankAccount(String number, String password, String name, int balance) {
		this.number = number;
		this.password = password;
		this.name = name;
		this.balance = balance;
		System.out.println(number+" 계좌가 개설되었습니다.");
	}
	//입금
	public void deposit(int money) {
		if (money <= 0) {
			System.out.println("0이하의 금액은 입금할 수 없습니다.");
			return;
		}
		System.out.printf("%,d원이 입금되었습니다.",money);
		balance += money;
	}
	//출금
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("0이하의 금액은 출금할 수 없습니다.");
			return;
		}
		if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		System.out.printf("%,d원이 출금되었습니다.",money);
		balance -= money;
	}
	//계좌정보
	public void printAccount() {
		System.out.println("(일반)계좌번호 : "+number);
		System.out.println("비밀번호 : "+password);
		System.out.println("예금주 : "+name);
		System.out.printf("잔고 : %,d원",balance);
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
