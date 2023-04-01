package gregorianCalender;

import java.util.GregorianCalendar;
import java.util.Scanner;

//사용자 한테 연도를 입력받아
//그 해가 윤년인지 판별하는 프로그램을 작성 해 봅니다.
public class GregorianCalendarTest02 {

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
	Scanner sc = new Scanner(System.in);
	int year;
	System.out.println("연도를 입력==>");
	year = sc.nextInt();
	
	if(cal.isLeapYear(year)) {
		System.out.println(year+"년도는 윤년입니다.");
	}else {
		System.out.println(year+"년도는 윤년이 아닙니다.");
	}

	}

}
