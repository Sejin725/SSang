package kr.s09.score;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ScoreMain2 {
	/*
	 * [실습]
	 * ArrayList에 Score 저장하는 프로그램
	 * 메뉴 : 1.성적입력, 2.성적출력, 3.종료
	 * 조건체크 : 성적입력 유효 범위 체크 0~100
	 */
	BufferedReader br;
	ArrayList<Score> list;
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	
	public ScoreMain2() {
		list = new ArrayList<Score>();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 
			if (br!=null) try{br.close();}catch(IOException e) {}
		}
	}
	
	private void callMenu() throws IOException {
		while (true) {
			System.out.println("메뉴 : 1.성적입력, 2.성적출력, 3.종료");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					inputScore();
				}else if (num == 2) {
					printScore();
				}else if (num == 3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못된 입력");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}
	}
	// 성적입력 메서드
	private void inputScore()throws IOException {
		Score s = new Score();
		System.out.print("이름 : ");
		s.setName(br.readLine());
		s.setKorean(isOutOfRange("국어 : "));
		s.setEnglish(isOutOfRange("영어 : "));
		s.setMath(isOutOfRange("수학 : "));
		
		list.add(s);
	}
	// 성적출력 메서드
	private void printScore() {
		System.out.println("-------------------------------------------");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("-------------------------------------------");
		for (Score s : list) {
			System.out.printf("%d점\t",s.getKorean());
			System.out.printf("%d점\t",s.getEnglish());
			System.out.printf("%d점\t",s.getMath());
			System.out.printf("%d점\t",s.makeSum());
			System.out.printf("%.2f점\t",s.makeAvg());
			System.out.printf("%s%n",s.makeGrade());
		}
	}
	// 국,영,수 범위 check절
	private int isOutOfRange(String course) throws IOException {
		while (true) {
			System.out.print(course); //과목표시
			try {
				int input = Integer.parseInt(br.readLine());
				//성적 유효 범위 (0~100) 체크
				if (input < 0 || input > 100) {
					throw new ScoreValueException("0 ~ 100 까지의 수 입력");
				}
				return input;
			} catch (ScoreValueException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
		}
	}

	public static void main(String[] args) {
		new ScoreMain2();
	} // end of main
}
