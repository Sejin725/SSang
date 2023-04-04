package kr.s09.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ScoreMain {
	/*
	 * [실습]
	 * ArrayList에 Score 저장하는 프로그램
	 * 메뉴 : 1.성적입력, 2.성적출력, 3.종료
	 * 조건체크 : 성적입력 유효 범위 체크 0~100
	 */
	BufferedReader br;
	ArrayList<Score> list;
	
	public ScoreMain() {
		list = new ArrayList<Score>();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}finally { 
			//자원정리 (프로그램이 종료되었을경우)
			if (br!=null) try{br.close();}catch(IOException e) {}
		}
	}
	
	private void callMenu() throws IOException {
		while (true) {
			System.out.println("\n메뉴 : 1.성적입력, 2.성적출력, 3.종료");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					Score s = new Score();
					System.out.print("이름 : ");
					s.setName(br.readLine());
					s.setKorean(isOutOfRange("국어 : "));
					s.setEnglish(isOutOfRange("영어 : "));
					s.setMath(isOutOfRange("수학 : "));
					
					list.add(s);
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

	private void printScore() {
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		for (Score s : list) {
			System.out.printf("%d점\t",s.getKorean());
			System.out.printf("%d점\t",s.getEnglish());
			System.out.printf("%d점\t",s.getMath());
			System.out.printf("%d점\t",s.makeSum());
			System.out.printf("%.2f점\t",s.makeAvg());
			System.out.printf("%s%n",s.makeGrade());
		}
	}

	private int isOutOfRange(String m) throws IOException {
		while (true) {
			System.out.print(m);
			try {
				int input = Integer.parseInt(br.readLine());
				if (input < 0 || input > 100) {
					System.out.println("0 ~ 100 까지의 수 입력");
					continue;
				}
				return input;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
			}
		}
	}

	public static void main(String[] args) {
		new ScoreMain();
	} // end of main
}
