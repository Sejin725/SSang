package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hundred")
public class HundredServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		/*
		 * [실습]
		 * 1부터 100까지의 합 출력(반복문 활용)
		 * [출력예시]
		 * 1부터 100까지의 합은 5050
		 */
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Hundred 서블릿</title></head>");
		out.println("<body>");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		out.println("1부터 100까지의 합은 " + sum);
		out.println("</body>");
		out.println("</html>");
	}
}
