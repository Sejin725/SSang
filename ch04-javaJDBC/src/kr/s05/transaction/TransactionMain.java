package kr.s05.transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.util.DBUtil;

public class TransactionMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			//트랜잭션을 수동 처리하기 위해 auto commit을 해제함
			conn.setAutoCommit(false);
			
			sql = "insert into test1 values('Korea',500) ";
			
			pstmt1 = conn.prepareStatement(sql);
			pstmt1.executeUpdate();
			
			sql = "insert into test1 values('England',400) ";
			
			pstmt2 = conn.prepareStatement(sql);
			pstmt2.executeUpdate();
			
			sql = "insert into test1 values('Japan',500) ";
			
			pstmt3 = conn.prepareStatement(sql);
			pstmt3.executeUpdate();
			
			// 수동커밋 수행
			conn.commit();
			System.out.println("작업 완료 !!!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//자원정리
			DBUtil.executeClose(null, pstmt1, conn);
		}
	}// end of main
}
