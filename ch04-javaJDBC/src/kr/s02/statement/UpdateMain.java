package kr.s02.statement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_pw = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			// JDBC 수행 1단계 : JDBC 드라이버 로드
			Class.forName(db_driver);
			
			// JDBC 수행 2단계 : 커넥션 객체 생성 및 DB접속
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

			// SQL문 작성
			sql ="update test1 set age=90 where id='star'";
			
			// JDBC 수행 3단계 : statement 객체 생성
			stmt = conn.createStatement();
			
			// JDBC 수행 4단계 : SQL문 수행
			// Update문을 실행해서 테이블의 행을 수정하고, 수정한 행의 개수를 반환함
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "개 행의 정보를 수정했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
	} // end of main
}
