package chap11;
import java.util.*;
public class CalenderExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
	String weekday = null;
	switch(week)
	{
	
	case Calendar.MONDAY:
		weekday = "월요일";
		break;
	
	case Calendar.TUESDAY:
		weekday = "화요일";
		break;
		
	case Calendar.WEDNESDAY:
		weekday = "수요일";
		break;
		
	case Calendar.THURSDAY:
		weekday = "목요일";
		break;
		
	case Calendar.FRIDAY:
		weekday = "금요일";
		break;
		
	case Calendar.SATURDAY:
		weekday = "일요일";
		break;
		
	case Calendar.SUNDAY:
		weekday = "일요일";
		break;

	}
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	
	System.out.print(year+"년 ");
	System.out.print(month + "월 ");
	System.out.print(day + "일 ");
	System.out.print(weekday + " ");
	System.out.print(hour + "시 " );
	System.out.print(minute + "분");
	}

}
