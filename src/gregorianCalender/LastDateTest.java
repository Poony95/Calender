package gregorianCalender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LastDateTest {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		int last = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(last);//현재 달의 마지막 날 구하기
		
		GregorianCalendar today2 = new GregorianCalendar(2023,1,1);
		int last2 = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(last2);//2023.1.1 달의 마지막 날 지정하여 구하기
	}

}
