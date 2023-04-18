package kr.s08.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookAdminMain {
	private BufferedReader br;
	private BookDAO dao;
	
	public BookAdminMain() {
		
		try {
			dao = new BookDAO();
			br = new BufferedReader(new InputStreamReader(System.in));
			
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}//생성자
	
	public void callMenu() throws IOException{
		while (true) {
			System.out.println("1.도서등록,2.도서목록,3.대출목록,4.회원목록,5.종료 ");
			System.out.print("입력> ");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) {			//도서등록
					System.out.print("책이름 : ");
					String name = br.readLine();
					System.out.print("카테고리 : ");
					String category = br.readLine();
					
					dao.createBook(name,category);
				}else if (no == 2) {	//도서목록
					dao.listBook();
				}else if (no == 3) {	//대출목록
					dao.loanBookList();
				}else if (no == 4) {	//회원목록
					dao.listMember();
				}else if (no == 5) {	//종료
					System.out.println("관리자시스템 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}// end of while
	}// end of callMenu()
	public static void main(String[] args) {
		new BookAdminMain();
	}// end of main
}
