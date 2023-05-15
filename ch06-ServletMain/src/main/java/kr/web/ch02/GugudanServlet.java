package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		//클라이언트에서 전송된 데이터를 반환
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>구구단 출력</title></head>");
		out.println("<body>");
		out.println("구구단 "+ dan +"단<br>");
		out.println("------------------------------<br>");
		for (int i = 1; i <= 9; i++) {
			out.println(dan + " * " + i + " = " + dan*i +"<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
