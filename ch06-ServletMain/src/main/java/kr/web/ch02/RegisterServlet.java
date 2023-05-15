package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		// name, age, job, phone[0,1,2]
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String job = request.getParameter("job");
		
		String[] phone = request.getParameterValues("phone");
		
		out.println("<html>");
		out.println("<head><title>회원가입 처리</title></head>");
		out.println("<body>");
		out.println(name + " 님의 정보 <br>");
		out.println("나이 : " + age +"<br>");
		out.println("직업 : " + job +"<br>");
		out.print("전화번호 : ");
		if (!phone[0].equals("") && !phone[1].equals("") && !phone[2].equals("")) {
			for (int i = 0; i < phone.length; i++) {
				if (i==phone.length-1) {
					out.println(phone[i]);
				}else {
					out.print(phone[i]+"-");
				}
			}
		}else {
			out.println("전화번호를 입력하세요");
		}
		out.println("</body>");
		out.println("</html>");
		
	}
}
