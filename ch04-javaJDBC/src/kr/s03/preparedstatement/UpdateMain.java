package kr.s03.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.util.DBUtil;

public class UpdateMain {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("번호 : ");
			int num = Integer.parseInt(br.readLine());
			
			System.out.print("제목 : ");
			String title = br.readLine();
			System.out.print("이름 : ");
			String name = br.readLine();
			System.out.print("메모 : ");
			String memo = br.readLine();
			System.out.print("이메일 : ");
			String email = br.readLine();
			
			System.out.println("---------------------");
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			System.out.println("test1 테이블에 데이터를 수정합니다.");
			
			//SQL문 작성
			sql = "update test2 set title=?, name=?, memo=?, email=? where num=?";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			//SQL문장 데이터 바인딩
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			//JDBC 수행 4단계 : SQL문 실행
			int count = pstmt.executeUpdate();
			
			System.out.println(count + "개 행의 정보를 수정하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}	// end of main
}
