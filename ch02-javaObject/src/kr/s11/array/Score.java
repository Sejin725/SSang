package kr.s11.array;

public class Score {
	/*
	 * [실습]
	 * 멤버변수 : 이름(name), 국어(korean), 영어(english), 수학(math)
	 * 생성자 : 기본생성자, 모든인자 생성자
	 * 멤버메서드 : get/set 메서드 정의, 총점 구하기(makeSum int반환), 
	 * 			 평균 구하기(makeAvg int반환), 등급(makeGrade char반환)
	 * 조건체크 X
	 */
	
	//변수
	private String name;
	private int korean;
	private int english;
	private int math;
	
	//생성자
	public Score() {}
	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public int makeSum() {
		return korean+english+math;
	}
	
	public int makeAvg() {
		return makeSum()/3;
	}
	
	public char makeGrade(int avg) {
		char Grade = 'A';
		switch (avg/10) {
		case 10:
		case 9: 
			break;
		case 8:
			Grade = 'B'; break;
		case 7:
			Grade = 'C'; break;
		case 6:
			Grade = 'D'; break;
		default:
			Grade = 'F'; break;
		}
		return Grade;
	}
	
	
	public char makeGrade() {
		char Grade;
		switch (makeAvg()/10) {
		case 10:
		case 9:
			Grade = 'A'; break;
		case 8:
			Grade = 'B'; break;
		case 7:
			Grade = 'C'; break;
		case 6:
			Grade = 'D'; break;
		default:
			Grade = 'F'; break;
		}
		return Grade;
	}
	
	
}
