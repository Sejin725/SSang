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
			
			//데이터를 buffer에 저장함 (파일에 저장하지 않음)
					//String -> byte[] 변환
			bos.write(str.getBytes());
			//버퍼를 비우고 버퍼에 데이터를 파일에 출력
			bos.flush();
			
			System.out.println("파일을 생성하고, 파일에 내용을 기술함");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리
			//BufferedOutputStream의 close 메서드는 자원정리하기 전에 buffer를 체크해서 남아있는 데이터가 있으면 flush처리함
			if(bos!=null)try {bos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
			
		}
		
		
		
		
		
		
		
		
		
	}	// end of main
}
