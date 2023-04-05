package kr.s14.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			//덮어쓰기
			fw = new FileWriter("fileWriter.txt");
			String message = "안녕하세요 FileWriter 테스트";
			
			//write 메서드는 char[], int(유니코드), String을 입력할 수 있다.
			//데이터를 buffer에 저장
			fw.write(message);
			//buffer를 비우고 buffer의 데이터를 파일로 전송
			fw.flush();
			
			System.out.println("파일을 생성하고 내용을 기술");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}	// end of main
}
