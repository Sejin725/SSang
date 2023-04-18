package kr.s08.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;

public class BookDAO {
	//도서 등록
	public void createBook(String name, String category) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "insert into book values (book_seq.nextval, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, category);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 추가하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of createBook()---도서등록
	//도서 목록 보기
	public void listBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select * from book order by 1 desc";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("=====================================================");
			System.out.println("도서번호\t제목\t카테고리\t등록날짜");
			while (rs.next()) {
				System.out.print(rs.getInt("bk_num")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				System.out.print(rs.getString("bk_category")+"\t");
				System.out.println(rs.getDate("bk_regdate")+"\t");
			}
			System.out.println("=====================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}// end of listBook()---도서목록보기
	//예외(수정,삭제)

	
	
	//아이디 중복 체크
	public int checkId(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select me_id from member where me_id=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;	//아이디 중복이면 1, 아니면 0
	}
	//회원가입
	//로그인 체크
	public int loginCheck(String me_id, String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int me_num = 0;	//회원 번호
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select me_num from member where me_id=? and me_passwd=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				//둘다 일치하지 않으면 안가져옴
				me_num = rs.getInt("me_num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return me_num;
	}// end of loginCheck()---로그인체크
	//회원 목록 보기
	
	
	//도서 대출 여부 확인
	//도서 대출 등록
	//대출 목록 보기 (누가, 무슨책을, 언제부터, 조건:status=1)
	public void loanBookList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select m.me_name name, b.bkname bname, r.re_regdate rdate"
					+ "from reservation r join book b on r.bk_num = b.bk_num "
					+ "join member m on r.me_num = m.me_num";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("=====================================================");
			System.out.println("이름\t제목\t대여날짜");
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("bname")+"\t");
				System.out.println(rs.getDate("rdate")+"\t");
			}
			System.out.println("=====================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}// end of loanBookList()---대출목록보기
	//My 대출 목록 보기(회원 자신의 것만)
	//반납 가능 여부
	//반납 처리
	
	
}
