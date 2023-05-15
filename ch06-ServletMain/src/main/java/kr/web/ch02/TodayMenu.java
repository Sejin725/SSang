package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todayMenu")
public class TodayMenu extends HttpServlet{
	//클라이언트에서 get 방식으로 데이터를 전송하면 doGet메서드 구현,
	//post 방식으로 전송하면 doPost로 구현
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//전송된 데이터 인코딩 처리(POST 방식으로 전송된 데이터 필수 지정)
		request.setCharacterEncoding("utf-8");
		//전송된 데이터를 반환
		String values[] = request.getParameterValues("lunch");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Result Greeting</title></head>");
		out.println("<body>");
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				out.println(values[i] + "<br>");
			}// end of for
		}else {
			out.println("선택하지 않음");
		}
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");
	}
}
