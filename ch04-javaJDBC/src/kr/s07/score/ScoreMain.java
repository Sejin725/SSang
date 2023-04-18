package kr.s07.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	
	public ScoreMain() {
		try {
			dao = new ScoreDAO();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			CallMenu();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	//메뉴
	public void CallMenu() throws IOException {
		while (true) {
			System.out.println("1.성적입력, 2.목록보기, 3.성적상세정보, 4.성적수정, 5.성적삭제, 6.종료");
			System.out.print(">>> ");
			try {
				int no = Integer.parseInt(br.readLine());
				// 번호 선택
				if (no == 1) {	//입력
					System.out.print("이름 : ");
					String name = br.readLine();
					int korean = parseInputData("국어 : ");
					int english = parseInputData("영어 :  ");
					int math = parseInputData("수학 : ");
					int sum = makeSum(korean,english,math);
					int avg = makeAvg(sum);
					String grade = makeGrade(avg);
					
					dao.insertScore(name, korean, english, math, sum, avg, grade);
				}else if (no == 2) {	//목록
					dao.selectInfo();
				}else if (no == 3) {	//상세정보
					dao.selectInfo();
					System.out.print("상세정보 할 번호 : ");
					int num = Integer.parseInt(br.readLine());
					
					dao.selectDetailInfo(num);
				}else if (no == 4) {	//수정
					
				}else if (no == 5) {	//삭제
					
				}else if (no == 6) {	//종료
					System.out.println("시스템을 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
	}// end of CallMenu()
	
	
	//총점 구하기
	public int makeSum(int korean, int english, int math) {
		return korean+english+math;
	}
	//평균 구하기
	private int makeAvg(int sum) {
		return sum/3;
	}
	//등급 구하기
	private String makeGrade(int avg) {
		String grade;
		switch (avg/10) {
		case 10: 
		case 9:	grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F"; break;
		}
		return grade;
	}
	//성적 범위 체크(0~100) [유효성검사]
	public int parseInputData(String course) throws IOException{
		while (true) {
			System.out.print(course);
			try {
				int num = Integer.parseInt(br.readLine());
				if (num<0 || num>100)
					throw new ScoreValueException("0부터 100사이의 값만 인정!!");
				return num;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요!!");
			} catch (ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}// end of parseInputData()---유효성검사
	
	public static void main(String[] args) {
		new ScoreMain();
	}	// end of main
}
