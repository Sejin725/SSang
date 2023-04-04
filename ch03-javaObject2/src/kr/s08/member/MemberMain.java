package kr.s08.member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MemberMain {
	/*
	 * [실습] ArrayList에 Member객체를 저장하는 방식으로 회원 정보를 관리 메뉴 : 1.회원정보입력, 2.회원정보출력, 3.종료
	 * 조건체크 : 회원정보를 입력 받을 때 나이는 1살이상 입력 가능
	 */
	BufferedReader br;
	ArrayList<Member> list;

	public MemberMain() {
		list = new ArrayList<Member>();

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) try {br.close();} catch (IOException e) {}
		}
	}

	public void callMenu() throws IOException {
		while (true) {
			System.out.print("\n1.회원정보입력, 2.회원정보출력, 3.종료");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					Member m = new Member();
					System.out.print("이름 : ");
					m.setName(br.readLine());
					System.out.print("나이 : ");
					int age = Integer.parseInt(br.readLine());
					if (age <= 0) {
						System.out.println("나이는 1살이상 입력가능");
						continue;
					} else
						m.setAge(age);
					System.out.print("직업 : ");
					m.setJob(br.readLine());
					System.out.print("주소 : ");
					m.setAddress(br.readLine());
					System.out.print("전화번호 : ");
					m.setPhone(br.readLine());

					list.add(m);
				} else if (num == 2) {
					System.out.println("총회원수(" + list.size() + ")");
					System.out.println("--------------------------------");
					System.out.println("이름\t나이\t직업\t주소\t전화번호");
					System.out.println("--------------------------------");
					for (Member m : list) {
						System.out.printf("%s\t", m.getName());
						System.out.printf("%d\t", m.getAge());
						System.out.printf("%s\t", m.getJob());
						System.out.printf("%s\t", m.getAddress());
						System.out.printf("%s%n", m.getPhone());
					}
				} else if (num == 3) {
					System.out.println("종료");
					break;
				} else {
					System.out.println("잘못된 입력");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		} // end of while

	} // end of callMenu()

	// 회원가입
	public void register() throws IOException {
		Member m = new Member();
		System.out.print("이름 : ");
		m.setName(br.readLine());
		m.setAge(parseInputData("나이 : "));
		System.out.print("직업 : ");
		m.setJob(br.readLine());
		System.out.print("주소 : ");
		m.setAddress(br.readLine());
		System.out.print("전화번호 : ");
		m.setPhone(br.readLine());

		list.add(m);
	}

	// 회원정보출력
	public void printUserInfo() {
		System.out.println("총회원수(" + list.size() + ")");
		System.out.println("--------------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호");
		System.out.println("--------------------------------");
		for (Member m : list) {
			System.out.printf("%s\t", m.getName());
			System.out.printf("%d\t", m.getAge());
			System.out.printf("%s\t", m.getJob());
			System.out.printf("%s\t", m.getAddress());
			System.out.printf("%s%n", m.getPhone());
		}
	}
	
	//나이조건체크
	public int parseInputData(String data)throws IOException {
		while (true) {
			System.out.print(data);
			try {
				int age = Integer.parseInt(br.readLine());
				if (age<=0) {
					System.out.println("나이는 1살이상 입력 가능");
					continue;
				}
				return age;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
		}
	}

	public static void main(String[] args) {
		new MemberMain();
	} // end of main
}
