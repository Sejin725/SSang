package kr.s01.exception;

public class ExceptionMain01 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		//테스트용으로 없는 인덱스 3을 호출해서 예외를 발생시킨다.
		//예외가 발생하면 예외가 발생한 지점에서 프로그램이 강제종료
		for (int i = 0; i <= array.length; i++) {
			//예외가 발생하고 프로그램이 멈춤
			//예외가 발생하면 예외 정보를 담고 있는 예외 객체가 생성되고, 예외 문구가 콘솔에 출력됨
			System.out.println("array["+i+"]:"+array[i]);
		}
		System.out.println("프로그램 끝");
	} // end of main
}
