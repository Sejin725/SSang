package kr.s11.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte;
		byte[] readbyte2;	//한글처리를 위해 byte배열을 생성함
		try {
			//파일로부터 데이터를 읽어오기 위해
			//FileInputStream 객체를 생성
			fis = new FileInputStream("file.txt");
			//파일의 정보를 한 문자씩 읽어들여 아스키 코드로 반환
			//영문 이외의 문자는 꺠짐
			/*
			while ((readbyte=fis.read()) != -1) {
				System.out.print((char)readbyte);
			}
			*/
			//영문이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()];
			fis.read(readbyte2);
								//byte[] -> String 변환
			System.out.println(new String(readbyte2));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  finally {
			//자원정리
			if (fis != null) try {fis.close();} catch(IOException e) {}
		}
	}
}
