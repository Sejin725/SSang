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
			
			sql = "insert into book values (book_seq.nextval, ?, ?, sysdate)";
			
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
				System.out.print(rs.getInt("bk_num")+"\t\t");
				System.out.print(rs.getString("bk_name")+"\t");
				System.out.print(rs.getString("bk_category")+"\t\t");
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
	public void registerMember(String me_id, String me_passwd, String me_name, String me_phone) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "insert into member values (member_seq.nextval, ?, ?, ?, ?, sysdate)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			pstmt.setString(3, me_name);
			pstmt.setString(4, me_phone);
			
			int count = pstmt.executeUpdate();
			if (count==1) 
				System.out.println("회원가입이 정상적으로 완료되었습니다.");
			else
				System.out.println("오류발생");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of registerMember()---회원가입
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
	public void listMember() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select * from member order by 1";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("=====================================================");
			System.out.println("회원번호\t아이디\t이름\t전화번호\t생성일");
			while (rs.next()) {
				System.out.print(rs.getInt("me_num")+"\t\t");
				System.out.print(rs.getString("me_id")+"\t");
				System.out.print(rs.getString("me_name")+"\t");
				System.out.print(rs.getString("me_phone")+"\t");
				System.out.println(rs.getDate("me_regdate")+"\t");
			}
			System.out.println("=====================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}// end of listMember()---회원 목록 보기
	
	//도서 대출 여부 확인
	public int isloanBook(int bNum) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int status = 1;
		int bk_num = 0; //해당 책번호가 존재하지 않으면 0
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select re_status, bk_num from reservation where bk_num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bNum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				status = rs.getInt("re_status");
				bk_num = rs.getInt("bk_num");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		if (bk_num==0) //책 번호가 존재하지 않을경우
			status = -1;
		
		return status;
	}
	//도서 대출 등록
	public void loanBook(int bNum, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "insert into reservation(re_num,re_status,bk_num,me_num) values (reservation_seq.nextval, 1, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bNum);
			pstmt.setInt(2, me_num);
			
			int count = pstmt.executeUpdate();
			if (count==1) 
				System.out.println("도서 대출 완료");
			else 
				System.out.println("오류 발생");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of loanBook()---도서 대출 등록
	//대출 목록 보기 (누가, 무슨책을, 언제부터, 조건:status=1)
	public void loanBookList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select r.re_num rnum, b.bk_num bnum, r.re_status rst, m.me_name name, b.bk_name bname, r.re_regdate rdate, nvl(to_char(r.re_modifydate, 'yyyy-mm-dd'),null) mdate "
					+ "from reservation r join book b on r.bk_num = b.bk_num "
					+ "join member m on r.me_num = m.me_num ";
					//+ "where r.re_status = 1";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("=====================================================");
			System.out.println("대출번호\t책번호\t\t대여상태\t이름\t제목\t대여날짜\t반납날짜");
			while (rs.next()) {
				System.out.print(rs.getInt("rnum")+"\t\t");
				System.out.print(rs.getInt("bnum")+"\t\t");
				if (rs.getInt("rst")==1) {
					System.out.print("대여중\t\t");
				}else {
					System.out.print("반납\t\t");
				}
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("bname")+"\t");
				System.out.print(rs.getDate("rdate")+"\t");
				System.out.println(rs.getString("mdate"));
			}
			System.out.println("=====================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}// end of loanBookList()---대출목록보기
	//My 대출 목록 보기(회원 자신의 것만)
	public boolean MyloanList(int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		try {
			conn = DBUtil.getConnection();
			
			sql = "select r.re_num rnum, b.bk_num bnum, m.me_name name, b.bk_name bname, r.re_regdate rdate, m.me_num mnum "
					+ "from reservation r join book b on r.bk_num = b.bk_num "
					+ "join member m on r.me_num = m.me_num "
					+ "where m.me_num = ? and r.re_status = 1";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, me_num);
			rs = pstmt.executeQuery();
			
			/*
			if (rs.next()) {
				flag=true;
				rs.beforeFirst();
				System.out.println("=====================================================");
				System.out.println("대출번호\t책번호\t\t이름\t제목\t대여날짜");
				while (rs.next()) {
					System.out.print(rs.getInt("rnum")+"\t\t");
					System.out.print(rs.getInt("bnum")+"\t\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("bname")+"\t");
					System.out.println(rs.getDate("rdate")+"\t");
				}
				System.out.println("=====================================================");
			}
			*/
			if (rs.next()) {
				flag=true;
				System.out.println("=====================================================");
				System.out.println("대출번호\t책번호\t\t이름\t제목\t대여날짜");
				do {
					System.out.print(rs.getInt("rnum")+"\t\t");
					System.out.print(rs.getInt("bnum")+"\t\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("bname")+"\t");
					System.out.println(rs.getDate("rdate")+"\t");
				}while(rs.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return flag;
	}
	//반납 가능 여부 ? (내가 대여한 책인지 확인)
	public int isMyloanBook(int rNum, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int status = 0;	// 0이면 반납 불가
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "select re_status from reservation where re_num=? and me_num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rNum);
			pstmt.setInt(2, me_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				status = rs.getInt("re_status");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return status;
	}// end of isMyloanBook()---반납 가능 여부
	//반납 처리
	public void returnBook(int rNum, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			conn = DBUtil.getConnection();
			
			sql = "update reservation set re_status=0, re_modifydate=sysdate where re_num=? and me_num=? and re_status=1";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, rNum);
			pstmt.setInt(2, me_num);
			
			int count = pstmt.executeUpdate();
			if (count==1) 
				System.out.println("도서 반납 완료");
			else
				System.out.println("오류 발생");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}// end of returnBook()---반납 처리
	
	
}
