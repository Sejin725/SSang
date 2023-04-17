package kr.s04.callablestatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.CallableStatement;
import java.sql.Connection;

import kr.util.DBUtil;

public class CallableStatementMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("이름 : ");
			String name = br.readLine();
			System.out.print("인상률 : ");
			float rate = Float.parseFloat(br.readLine());
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			// 프로시저 호출 문장 작성
			sql = "{call adjust(?, ?)}";
			
			// JDBC 수행 3단계
			cstmt = conn.prepareCall(sql);
			
			// ?에 데이터 바인딩
			cstmt.setString(1, name);
			cstmt.setFloat(2, rate);
			
			// JDBC 수행 4단계
			int count = cstmt.executeUpdate();
			
			System.out.println(count + "개행 프로시저가 수행되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	// 자원정리
			DBUtil.executeClose(cstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}	// end of main
}
