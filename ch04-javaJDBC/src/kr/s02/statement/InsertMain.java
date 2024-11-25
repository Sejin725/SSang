package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_pw = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			//JDBC 수행 2단계 : Connection 객체를 생성해서 오라클에 접속
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			//SQL문 작성
			sql = "insert into test1 (id,age) "
				+ "values ('d''star',40)";		//ORA-00917: 누락된 콤마
			
			//JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행 4단계 : SQL문을 실행해서 하나의 행을 삽입, 삽입 작업 후 삽입한 행의 개수를 반환
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count + "개의 행을 추가 했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
	}	// end of main
}
