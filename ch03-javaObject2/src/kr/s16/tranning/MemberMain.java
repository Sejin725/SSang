package kr.s16.tranning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberMain {
	/*
	 * [실습]
	 * ArrayList에 Member 객체를 저장
	 * 메뉴 : 1. 회원정보입력, 2. 회원정보출력, 3. 파일생성(생성한회원정보추가), 4. 파일읽기(전체조회) 5.종료
	 * 조건체크 :  나이는 1살이상 입력 가능
	 */
	BufferedReader br;
	ArrayList<Member> list;
	public MemberMain(){
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}	// end of MemberMain
	private void callMenu() throws IOException{
		while (true) {
			System.out.println("\n메뉴 : 1. 회원정보입력, 2. 회원정보출력, 3. 파일생성(생성한회원정보추가), 4. 파일읽기(전체조회) 5.종료");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					createUser();
				}else if (num == 2) {
					printUser();
				}else if (num == 3) {
					saveUser(list);
				}else if (num == 4) {
					callUser();
				}else if (num == 5) {
					System.out.println("시스템 종료");
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			}
		} // end of while
	}
	private void callUser() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("MemberInfo.ser");
			ois = new ObjectInputStream(fis);
			list = (ArrayList<Member>)ois.readObject();
			printUser();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
	}
	private void saveUser(ArrayList<Member> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("MemberInfo.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(oos!=null)try {oos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
	private void printUser() {
		System.out.println("이름\t나이\t직업\t주소\t전화번호\t취미");
		System.out.println("-------------------------------------------------------");
		for (Member m : list) {
			System.out.print(m.getName()+"\t");
			System.out.print(m.getAge()+"\t");
			System.out.print(m.getJob()+"\t");
			System.out.print(m.getAddress()+"\t");
			System.out.print(m.getPhone()+"\t");
			System.out.print(m.getHobby()+"\n");
		}
	}
	private void createUser() throws IOException{							// 회원정보입력
		Member m = new Member();
			System.out.print("이름 : ");
			m.setName(br.readLine());
			m.setAge(isOutofAge());
			System.out.print("직업 : ");
			m.setJob(br.readLine());
			System.out.print("주소 : ");
			m.setAddress(br.readLine());
			System.out.print("전화번호 : ");
			m.setPhone(br.readLine());
			System.out.print("취미 : ");
			m.setHobby(br.readLine());
			
			list.add(m);
	}
	
	private int isOutofAge() throws IOException{	//	나이체크
		while (true) {
			System.out.print("나이 : ");
			try {
				int age = Integer.parseInt(br.readLine());
				if (age > 0) {
					return age;
				}
				System.out.println("나이는 1살이상 입력 가능");
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요");
			}
		}
	}
	public static void main(String[] args) {
		new MemberMain();
	}	// end of main
}
