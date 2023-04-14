package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "c##user001";
		String db_pw = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		ResultSet rs = null;
		
		try {
			//JDBC 수행 1단계 : 드라이버 로드
			Class.forName(db_driver);
			
			//JDBC 수행 2단계 : 커넥션 객체 생성 및 DB 접속
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			//SQL문 작성
			sql = "select * from test1";
			
			//JDBC 수행 3단계 : Statement 객체 생성
			stmt = conn.createStatement();
			
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 레코드(행)을 전달 받아 결과집합을 만들고
			//					ResultSet 객체에 담아 반환
			rs = stmt.executeQuery(sql);
			
			System.out.println("ID\t나이");
			//ResultSet에 보관된 결과집합에 접근해서 행단위로 데이터를 추출
			while (rs.next()) {
				//컬럼명을 통해서 데이터를 반환
				System.out.print(rs.getString("id")+"\t");
				System.out.print(rs.getInt("age")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs!=null)try {rs.close();}catch(SQLException e) {}
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
		
	}
}
