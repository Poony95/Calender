package gregorianCalender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest01 {

	public static void main(String[] args) {
		String []str= {"","일","월","화","수","목","금","토"};
		GregorianCalendar today = new GregorianCalendar();
		int yy = today.get(Calendar.YEAR);
		int mm = today.get(Calendar.MONTH);
		int dd = today.get(Calendar.DAY_OF_MONTH);
		int dy = today.get(Calendar.DAY_OF_WEEK);
		int hh = today.get(Calendar.HOUR_OF_DAY);
		int MM = today.get(Calendar.MINUTE);
		int ss = today.get(Calendar.SECOND);
		String day = str[dy];
		
		String result = String.format("%d년 %d월 %d일(%s요일) %d시 %d분 %d초", 
				yy,mm+1,dd,day,hh,MM,ss); // 출력문 month +1해줘야함.
		System.out.println(result);
	}

}
