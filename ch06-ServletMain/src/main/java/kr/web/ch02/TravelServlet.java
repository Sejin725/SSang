package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/travel")
public class TravelServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String[] cities = request.getParameterValues("city");
		String name = request.getParameter("name");
		
		//[]city, name
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>여행지 선택 출력</title></head>");
		out.println("<body>");
		out.println(name + " 님이 선택한 여행지<br>");
		out.println("-------------------------------------------<br>");
		if (cities!=null) {
			for (int i = 0; i < cities.length; i++) {
				if (i==cities.length-1)
					out.println(cities[i]);
				else 
					out.print(cities[i]+",");
			}// end of for
		}else
			out.println("없음");
		
		
		out.println("</body>");
		out.println("</html>");
		
	}
}
