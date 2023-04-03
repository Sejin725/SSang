package kr.s07.constructor;

class Student {
	// 멤버변수
	int korean;
	int engilsh;
	int math;
	int history;
	int science;
	int num; // 과목수

	// 생성자 오버로딩
	public Student(int k, int e, int m) {
		korean = k;
		engilsh = e;
		math = m;
		num = 3;
	}

	public Student(int k, int e, int m, int h, int s) {
		korean = k;
		engilsh = e;
		math = m;
		history = h;
		science = s;
		num = 5;
	}

	// 멤버메서드
	// 총점구하기
	public int getTotal() {
		int total;
		if (num == 3) {
			total = korean + engilsh + math;
		} else {
			total = korean + engilsh + math + history + science;
		}
		return total;
	}

	// 평균구하기
	public int getAverage() {
		return getTotal() / num;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		// 인자의 개수가 3개인 생성자를 호출해서 객체 생성
		Student st = new Student(90, 97, 95);
		System.out.println("합계 = " + st.getTotal());
		System.out.println("평균 = " + st.getAverage());
		System.out.println("--------------------");

		// 인자의 개수가 5개인 생성자를 호출해서 객체 생성
		Student st2 = new Student(88, 82, 84, 87, 90);
		System.out.println("합계 = " + st2.getTotal());
		System.out.println("평균 = " + st2.getAverage());

	}
}
