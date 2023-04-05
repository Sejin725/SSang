package kr.s12.output;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("bufferOut.txt");
			bos = new BufferedOutputStream(fos);
			String str = "BufferedOutputStream Test입니다.";
			
			//생성된 파일에 데이터를 저장
					//String -> byte[] 변환
			bos.write(str.getBytes());
			
			System.out.println("파일을 생성하고, 파일에 내용을 기술함");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리
		}
		
		
		
		
		
		
		
		
		
	}	// end of main
}
