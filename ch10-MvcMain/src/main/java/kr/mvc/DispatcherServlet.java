package kr.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DispatcherServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//공통 메서드 호출
		requestPro(request, response);
	}
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//공통 메서드 호출
		requestPro(request, response);
		
	}
	//흐름 제어를 위한 공통 메서드
	private void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//forward 방식으로 JSP 호출
		/* 
		 * 1. 클라이언트에게 링크를 알리지 않기 위해(해킹 방지)
		 * 2. request 를 공유하기 위해서 (데이터를 담아서 재활용(사용)하기 위해)
		 */
		
		Action com = null;
		String view = null;
		
		//클라이언트가 호출한 주소 (URI) 반환 [예시 : /ch10-MvcMain/write.do ]
		String command = request.getRequestURI();
		
		//호출한 주소의 뒤에 컨텍스트 경로 다음의 주소 추출
		// [ /list.do 또는 /detail.do ]
		if (command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length());
		}
		//전송된 데이터 반환
		if (command==null || command.equals("/list.do")) {
			com = new ListAction(); 
		}else if (command.equals("/write.do")) {
			com = new WriteAction();
		}else if (command.equals("/detail.do")) {
			com = new DetailAction();
		}else if (command.equals("/update.do")) {
			com = new UpdateAction();
		}else if (command.equals("/delete.do")) {
			com = new DeleteAction();
		}
		
		try {
			view = com.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//forward 방식으로 JSP 호출
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}
}





















