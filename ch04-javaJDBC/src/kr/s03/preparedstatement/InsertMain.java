package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class InsertMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("제목 : ");
			String title = br.readLine();
			System.out.print("이름 : ");
			String name = br.readLine();
			System.out.print("메모 : ");
			String memo = br.readLine();
			System.out.print("이메일 : ");
			String email = br.readLine();
			
			conn = DBUtil.getConnection();
			
			// SQL문 작성
			sql = "insert into test2 (num, title, name, memo, email, reg_date) "
				+ "values (test2_seq.nextval, ?, ?, ?, ?, sysdate)";  
			
			// JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			// ?에 데이터 바인딩
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			
			int count = pstmt.executeUpdate();	// 안에 sql을 넣으면 매핑된 데이터를 ?로 덮어쓰는게 되는것이므로 오류가 발생함
			System.out.println(count + "개행 데이터가 삽입되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//자원정리		ResultSet은 사용을 안하므로 null처리함
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}	// end of main
}
