package kr.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.board.vo.BoardVO;
import kr.util.DBUtil;

//DAO : Data Access Object
public class BoardDAO {
	//싱글턴 패턴
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance () {
		return instance;
	}
	private BoardDAO() {}
	
	//글 저장
	public void insert(BoardVO boardVO)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//커넥션풀로부터 커넥션을 할당
			conn = DBUtil.getConnection();
			//sql문 작성
			sql = "insert into mboard (num, title, name, passwd, email, phone, content, ip, reg_date) values "
				+ "(mboard_seq.nextval, ?, ?, ?, ?, ?, ?, ?, sysdate) ";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardVO.getTitle());
			pstmt.setString(2, boardVO.getName());
			pstmt.setString(3, boardVO.getPasswd());
			pstmt.setString(4, boardVO.getEmail());
			pstmt.setString(5, boardVO.getPhone());
			pstmt.setString(6, boardVO.getContent());
			pstmt.setString(7, boardVO.getIp());
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			throw new Exception(e);
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//글의 총 갯수
	//글 목록
	public List<BoardVO> getList(int startRow, int endRow)throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> list = null;
		String sql = null;
		
		try {
			//커넥션풀로부터 커넥션을 할당
			conn = DBUtil.getConnection();
			//sql문 작성
			//startRow와 endRow가 존재할 경우, sql문을 수정한다. (where 구문에 between 지정)
			sql = "select * from mboard order by num desc";
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<BoardVO>();
			while(rs.next()) {
				BoardVO boardVO = new BoardVO();
				boardVO.setNum(rs.getInt("num"));
				boardVO.setTitle(rs.getString("title"));
				boardVO.setName(rs.getString("name"));
				boardVO.setReg_date(rs.getDate("reg_date"));
				//자바빈을 ArrayList에 저장
				list.add(boardVO);
			}
		} catch (Exception e) {
			throw new Exception(e);
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return list;
	}
	//글 상세
	//글 수정
	//글 삭제
}
