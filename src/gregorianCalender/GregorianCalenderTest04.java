package gregorianCalender;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregorianCalenderTest04 {
	// 사용자한테 연도와 월을 입력받아서
	// 그 달의 시작일의 요일에 대한 정수값을 출력하도록 합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year, month;
		System.out.println("연도를 입력하세요");
		year = sc.nextInt();
		System.out.println("월을 입력하세요");
		month = sc.nextInt();
		
		GregorianCalendar cal = new GregorianCalendar(year,month-1,1);
		
		int dy = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dy);

	}

}
