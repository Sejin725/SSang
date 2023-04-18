package kr.s07.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class ScoreDAO {
	//성적입력
	public void insertScore(String name, int korean, int english, int math, int sum, int avg, String grade) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "insert into score values (score_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, korean);
			pstmt.setInt(3, english);
			pstmt.setInt(4, math);
			pstmt.setInt(5, sum);
			pstmt.setInt(6, avg);
			pstmt.setString(7, grade);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 입력하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of InsertScore()---성적입력
	
	//목록보기 (번호,이름,국어,영어,수학,총점,평균,등급)
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select num, name, grade, korean, english, math, sum, avg, grade from score order by 1 desc";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("=====================================================================");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
			while (rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("korean")+"\t");
				System.out.print(rs.getInt("english")+"\t");
				System.out.print(rs.getInt("math")+"\t");
				System.out.print(rs.getInt("sum")+"\t");
				System.out.print(rs.getInt("avg")+"\t");
				System.out.println(rs.getString("grade"));
			}
			System.out.println("=====================================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}// end of selectInfo()---목록보기

	//성적상세정보
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select * from score where num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("=====================================================================");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급\t작성일");
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("korean")+"\t");
				System.out.print(rs.getInt("english")+"\t");
				System.out.print(rs.getInt("math")+"\t");
				System.out.print(rs.getInt("sum")+"\t");
				System.out.print(rs.getInt("avg")+"\t");
				System.out.print(rs.getString("grade")+"\t");
				System.out.println(rs.getDate("reg_date"));
				System.out.println("=====================================================================");
			}else {
				System.out.println("출력할 행이 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}	// end of selectDetailInfo()---성적상세정보
	
	
	//성적수정
	//성적삭제
	
}
