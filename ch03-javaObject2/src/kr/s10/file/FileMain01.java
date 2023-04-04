package kr.s10.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		//경로지정
		String path = "C:\\";
		
		File f = new File(path);
		
		if (!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		//지정한 경로의 하위 디렉토리와 파일 정보를 File 배열로 반환 (해당경로의 내부 리스트화)
		File[] files = f.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			File f2 = files[i];
			if (f2.isDirectory()) {
				//디렉토리인 경우
				System.out.println("["+f2.getName()+"]");		//디렉토리명
			}else {
				//파일인 경우
				System.out.print(f2.getName());					//파일명
				System.out.printf("(%,dbytes)\n",f2.length());	//파일의 용량
			}
		}
		
	}// end of main
}
