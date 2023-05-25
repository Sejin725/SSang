package kr.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	//추상 메소드
	public String execute(HttpServletRequest request, HttpServletResponse response)throws Exception;
}
