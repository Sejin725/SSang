package kr.s04.array;

public class ArrayMain08 {
	public static void main(String[] args) {
		if (args.length>0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(i + ":"+ args[i]);
			}
		}else { //args.length==0 의미하기 때문에 전달된 데이터가 없음
			System.out.println("입력한 내용이 없습니다");
		}
	}
}
