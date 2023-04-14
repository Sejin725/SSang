package kr.s01.basic;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_pw = "1234";
		try {
			// JDBC 드라이버 로딩
			Class.forName(db_driver);
			
			// Connection 객체생성 + 접속작업
			Connection conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("Connection 객체가 생성되었습니다.");
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}	// end of main
}
