package kr.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.board.dao.BoardDAO;
import kr.board.vo.BoardVO;
import kr.controller.Action;

public class WriteAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//전송된 데이터 인코딩 처리
		request.setCharacterEncoding("utf-8");
		//자바빈(VO)를 생성하고 전송된 데이터를 반환받아서 자바빈에 저장
		BoardVO boardVO = new BoardVO();
		
		boardVO.setTitle(request.getParameter("title"));
		boardVO.setName(request.getParameter("name"));
		boardVO.setPasswd(request.getParameter("passwd"));
		boardVO.setEmail(request.getParameter("email"));
		boardVO.setPhone(request.getParameter("phone"));
		boardVO.setContent(request.getParameter("content"));
		//클라이언트의 IP 정보를 가져옴
		boardVO.setIp(request.getRemoteAddr());
		
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.insert(boardVO);
		
		
		//JSP 경로 반환
		return "/WEB-INF/views/write.jsp";
	}

}
