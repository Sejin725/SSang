package kr.s06.note;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;
//Data Access Object : 전문적으로 DB 데이터에 접근하는 객체
public class NoteDAO {
	//글쓰기
	public void insertInfo(String name, String passwd, String subject, String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "insert into note values (note_seq.nextval,?,?,?,?,?,sysdate)";
			
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			
			// ? 에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of insertInfo()---글쓰기
	
	//목록 보기
	public void selectInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "select * from note order by num desc";
			
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			
			//JDBC 수행 4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("글번호\t제목\t\t이름\t\t작성일");
			while (rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("subject")+"\t\t");
				System.out.print(rs.getString("name")+"\t\t");
				System.out.println(rs.getDate("reg_date"));
			}
			System.out.println("-----------------------------------------------------------------");		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	} // end of selectInfo()---목록보기
	
	//상세글 보기
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "select * from note where num=?";
			
			//JDBC 수행3단계
			pstmt = conn.prepareStatement(sql);
			// ?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4단계 : SQL문을 실행
			rs = pstmt.executeQuery();
			//단일행
			if (rs.next()) {
				System.out.println("글번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("비밀번호 : " + rs.getString("passwd"));
				System.out.println("제목 : " + rs.getString("subject"));
				System.out.println("내용 : " + rs.getString("content"));
				System.out.println("이메일 : " + rs.getString("email"));
				System.out.println("작성일 : " + rs.getDate("reg_date"));
			}else {
				System.out.println("검색된 정보가 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	} // end of selectDetailInfo()---상세글 보기
	
	//글수정
	public void updateInfo(int num, String name, String passwd, String subject, String content, String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "update note set name=?, passwd=?, subject=?, content=?, email=? where num=?";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			pstmt.setInt(6, num);
			//JDBC 수행 4단계
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 데이터를 수정하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	} // end of updateInfo()---글수정
	
	//글삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "delete from note where num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			int count = pstmt.executeUpdate();
			if (count == 0) {
				System.out.println("삭제할 글이 없습니다.");
			}else {
				System.out.println(count + "개 행의 데이터를 삭제하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	} // end of deleteInfo()---글삭제
}
