package kr.s01.exception;

public class ExceptionMain03 {
	public static void main(String[] args) {
		int var = 50;
		/*
		 * 다중 catch문
		 * 예외가 발생하면 예외객체가 전달되는 catch 블럭으로 이동해서 수행문을 실행
		 */
		try {
						//String -> int
			int data = Integer.parseInt(args[0]);
			System.out.println(var/data);
			System.out.println("------------");
		/*
		 * (주의)다중 catch문을 사용할 때
		 * Exception과 하위 예외클래스를 동시에 명시할 때는
		 * 하위 예외클래스를 먼저 명시하고 가장 뒤에 Exception을 명시해야 동작상의 문제가 발생하지 않음
		 */
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("입력한 데이터가 없습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			System.out.println("나머지 예외는 여기에서 호출");
		} // end of try - catch
		System.out.println("프로그램 종료");
	}// end of main
}
