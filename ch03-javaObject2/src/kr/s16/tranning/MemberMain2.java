package kr.s16.tranning;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MemberMain2 {
	BufferedReader br;
	ArrayList<Member> list;
	//생성자
	public MemberMain2() {
		list = new ArrayList<Member>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	public void callMenu()throws IOException{
		while (true) {
			System.out.println("\n메뉴 : 1. 회원정보입력, 2. 회원정보출력, 3. 파일생성, 4. 파일읽기 5.종료");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num==1) {
					register();
				}else if (num==2) {
					printUserInfo();
				}else if (num==3) {
					createFile();
				}else if (num==4) {
					readFile();
				}else if (num==5) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능");
			}
		}
	}
	
	//회원가입
	public void register()throws IOException{
		System.out.print("이름:");
		String name = br.readLine();
		int age = parseInputData("나이:");
		System.out.print("직업:");
		String job = br.readLine();
		System.out.print("주소:");
		String address = br.readLine();
		System.out.print("전화번호:");
		String phone = br.readLine();
		System.out.print("취미:");
		String hobby = br.readLine();
		
		Member m = new Member(name,age,job,address,phone,hobby);
		list.add(m);
	}
	//나이 조건 체크
	public int parseInputData(String msg)throws IOException{
		while (true) {
			System.out.print(msg);
			try {
				int age = Integer.parseInt(br.readLine());
				if (age <= 0) {
					System.out.println("나이는 1살 이상 입력가능");
					continue;
				}
				return age;
			} catch (Exception e) {
				System.out.println("숫자만 입력 가능");
			}
		}
	}
	//회원목록출력
	public void printUserInfo() {
		System.out.println("총회원수("+list.size()+")");
		System.out.println("-------------------------------------------------------");
		System.out.println("이름\t나이\t직업\t주소\t전화번호\t취미");
		System.out.println("-------------------------------------------------------");
		for (Member m : list) {
			System.out.print(m.toString());
		}
	}
	//파일생성
	public void createFile() {
		FileWriter fw = null;
		try {
			//덮어쓰기
			fw = new FileWriter("score.txt");
			fw.write("총회원수("+list.size()+")\n");
			fw.write("-------------------------------------------------------\n");
			fw.write("이름\t나이\t직업\t주소\t전화번호\t취미\n");
			fw.write("-------------------------------------------------------\n");
			for (Member m : list) {
				fw.write(m.toString());
			}
			fw.flush();
			System.out.println("파일에 회원정보를 저장했습니다.");
		} catch (IOException e) {
			System.out.println("파일 생성 오류");
		} finally {
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
	//파일읽기
	public void readFile() {
		FileReader fr = null;
		int readChar;
		try {
			fr = new FileReader("score.txt");
			while ((readChar=fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (FileNotFoundException e) {
			System.out.println("생성된 파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 읽기 오류");
		} finally {
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
	}
	public static void main(String[] args) {
		new MemberMain2();
	}
}
