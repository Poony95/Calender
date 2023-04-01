package gregorianCalender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest06 {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int yy = today.get(Calendar.YEAR);
		int mm = today.get(Calendar.MONTH);
		
		System.out.printf("%d년 %d월\n",yy,mm+1);
		String []str = {"일","월","화","수","목","금","토"};
		
		for(String s:str) {
			System.out.printf("%-3s",s);
		}
		System.out.println();
		
		GregorianCalendar startDay = new GregorianCalendar(yy, mm, 1);
		int dy = startDay.get(Calendar.DAY_OF_WEEK);
		
		int last = startDay.getActualMaximum(Calendar.DAY_OF_MONTH);	
		//getActualMaximum은 해당 달의 마지막 날을 가져오는 메소드입니다.
		for (int i = 1; i < dy; i++) {
			System.out.printf("%3c",' ');
		}
		for (int i = 1; i <= last; i++) {
			System.out.printf("%3d",i);
			if((i+dy-1)%7==0) {
				System.out.println();
			}
		}
	}

}
