package kr.s20.util;

import java.util.Calendar;

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("-------------------------------------");
		
		int year = today.get(Calendar.YEAR);	//연도
		int month = today.get(Calendar.MONTH)+1;	//월 0 ~ 11
		int date = today.get(Calendar.DATE);	//일
		
		System.out.printf("%d년 %d월 %d일%n",year,month,date);
		System.out.println("-------------------------------------");
		
		int day = today.get(Calendar.DAY_OF_WEEK);	//요일 1 ~ 7
		String nday = null;
		switch (day) {
		case 1: nday = "일";break;
		case 2: nday = "월";break;
		case 3: nday = "화";break;
		case 4: nday = "수";break;
		case 5: nday = "목";break;
		case 6: nday = "금";break;
		case 7: nday = "토";break;
		}
		System.out.printf("%d년 %d월 %d일 %s요일%n",year,month,date,nday);
		System.out.println("-------------------------------------");
		
		//오전 0, 오후 1
		int amPm = today.get(Calendar.AM_PM);
		String str = amPm == Calendar.AM ? "오전" : "오후";
		
		
		//시 HOUR_OF_DAY(24시 표기)
		int hour = today.get(Calendar.HOUR);
		int min = today.get(Calendar.MINUTE);
		int sec = today.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s요일 %s %d시 %d분 %d초%n",year,month,date,nday,str,hour,min,sec);
		System.out.println("-------------------------------------");
		
		
		
	}// end of main
}
