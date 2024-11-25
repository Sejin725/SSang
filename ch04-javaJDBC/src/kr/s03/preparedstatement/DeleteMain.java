package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class DeleteMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.print("번호 : ");
			int num = Integer.parseInt(br.readLine());
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			System.out.println("test2 테이블의 데이터를 삭제합니다.");
			//SQL문 생성
			sql = "delete from test2 where num=?";
			
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 데이터를 삭제하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}	// end of main
}
