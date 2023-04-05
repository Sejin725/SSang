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
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리
		}
		
		
		
		
		
		
		
		
		
	}	// end of main
}
