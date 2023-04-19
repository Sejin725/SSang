package kr.s08.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookUserMain {
	private BufferedReader br;
	private BookDAO dao;
	private int me_num;		//회원 번호
	private boolean flag;	//로그인 여부
	
	public BookUserMain() {
		
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
			System.out.println("1.로그인,2.회원가입,3.종료 ");
			System.out.print("입력> ");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) {			//로그인
					System.out.print("아이디 : ");
					String me_id = br.readLine();
					System.out.print("패스워드 : ");
					String me_passwd = br.readLine();
					
					me_num = dao.loginCheck(me_id, me_passwd);
					if (me_num>0) {
						System.out.println(me_id + "님 로그인 되었습니다.");
						flag=true;
						break;
					}
					System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				}else if (no == 2) {	//회원가입
					String me_id;
					while (true) {
						System.out.print("아이디 : ");
						me_id = br.readLine();
						int count = dao.checkId(me_id);
						if (count==0) 
							break;
					}
					System.out.print("패스워드 : ");
					String me_passwd = br.readLine();
					System.out.print("이름 : ");
					String me_name = br.readLine();
					System.out.print("전화번호 : ");
					String me_phone = br.readLine();
					
					dao.registerMember(me_id, me_passwd, me_name, me_phone);
				}else if (no == 3) {	//종료
					System.out.println("유저시스템 종료");
					break;
				}else {
					System.out.println("잘못 입력하셧습니다.");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}// end of while
		
		//로그인했을 때 메뉴
		while(flag) {
			System.out.println("1.도서대출,2.My대출목록,3.대출도서반납,4.종료 ");
			System.out.print("입력> ");
			try {
				int no = Integer.parseInt(br.readLine());
				if (no == 1) {			//도서대출
					dao.listBook();
					System.out.print("대여할 도서번호 : ");
					int bNum = Integer.parseInt(br.readLine());
					
					int status = dao.isloanBook(bNum);
					if (status == 0) 
						dao.loanBook(bNum, me_num);
					else if(status == -1)
						System.out.println("해당 도서번호는 존재하지않습니다.");
					else
						System.out.println("해당 도서는 대여중입니다.");
				}else if (no == 2) {	//My대출목록
					dao.MyloanList(me_num);
				}else if (no == 3) {	//대출도서반납
					dao.MyloanList(me_num);
					System.out.print("반납할 도서번호 : ");
					int bNum = Integer.parseInt(br.readLine());
					
					int status = dao.isMyloanBook(bNum, me_num);
					if (status == 0) 
						System.out.println("반납 불가");
					else 
						dao.returnBook(bNum, me_num);
				}else if (no == 4) {	//종료
					System.out.println("로그아웃");
					flag=false;
					me_num=0;
					break;
				}else 
					System.out.println("잘못 입력했습니다.");
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}
		}// end of 로그인했을때 while
	}// end of callMenu()

	public static void main(String[] args) {
		new BookUserMain();
	}// end of main
}
