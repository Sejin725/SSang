package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//주소를 지정하는 어노테이션
@WebServlet("/now")
public class NowServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		Date now = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년mm월dd일 a hh:mm:ss");
		
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html;charset=utf-8");
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재 날짜와 시간</title></head>");
		out.println("<body>");
		out.println("현재 날짜와 시간 : " + sf.format(now));
		out.println("</body>");
		out.println("</html>");
		
		//생략 가능하지만 부하가 덜 발생하기 위해 문법상적어줌 
		out.close();
	}
}
