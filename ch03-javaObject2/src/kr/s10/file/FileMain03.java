package kr.s10.file;

import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//상대경로지정
		String path = "sample.txt";			//원래 파일명
		String new_path = "example.txt";	//새 파일명
		
		//원래 파일의 정보를 갖는 File 객체
		File f1 = new File(path);
		
		//새 파일의 정보를 갖는 File 객체
		File f2 = new File(new_path);
		
		System.out.println("===파일명 변경===");
		//파일명을 변경 가능하면 파일명을 변경하고 true 반환, 파일명을 변경할 수 없으면 false 반환
		System.out.println(f1.renameTo(f2));
		
	}	//end of main
}
