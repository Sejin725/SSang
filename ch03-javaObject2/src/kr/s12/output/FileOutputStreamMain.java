package kr.s12.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//덮어쓰기
			//fos = new FileOutputStream("fileOut.txt");
			//이어쓰기
			fos = new FileOutputStream("fileOut.txt",true);
			String messeage = "Hello File!! 파일에 내용 기술";
			
			//생성된 파일에 문자열을 저장
					//String -> byte[]
			fos.write(messeage.getBytes());
			
			System.out.println("파일을 생성하고 내용을 기술했습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fos!=null) try {fos.close();}catch(IOException e) {}
		}
		
	}	// end of main
}
