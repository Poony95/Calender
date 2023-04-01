package gregorianCalender;
/*
	사용자한테 연,월,일을 받아
	그 날짜의 요일을 출력하는 프로그램을 작성 해 봅니다.
	
*/
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregorianCalendarTest03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yy,mm,dd;
		System.out.print("연도를 입력==>");
		yy = sc.nextInt();
		System.out.print("월을 입력==>");
		mm = sc.nextInt();
		System.out.print("일을 입력==>");
		dd = sc.nextInt();
		
		GregorianCalendar cal = 
				new GregorianCalendar(yy, mm-1, dd);
		String []str= {"","일","월","화","수","목","금","토"};
		int dy = cal.get(Calendar.DAY_OF_WEEK);
		String day = str[dy];
		String result = 
		String.format("%d년 %d월 %d일은 %s요일입니다.",
				yy,mm,dd,day);
		System.out.println(result);

	}

}
