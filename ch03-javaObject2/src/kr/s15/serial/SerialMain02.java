package kr.s15.serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class SerialMain02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("userInfo.ser");
			ois = new ObjectInputStream(fis);
			
			//역직렬화 하기
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			
			for (UserInfo u : list) {
				System.out.println(u);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
				
	}	// end of main
}
