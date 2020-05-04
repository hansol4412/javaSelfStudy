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
		weekday = "������";
		break;
	
	case Calendar.TUESDAY:
		weekday = "ȭ����";
		break;
		
	case Calendar.WEDNESDAY:
		weekday = "������";
		break;
		
	case Calendar.THURSDAY:
		weekday = "�����";
		break;
		
	case Calendar.FRIDAY:
		weekday = "�ݿ���";
		break;
		
	case Calendar.SATURDAY:
		weekday = "�Ͽ���";
		break;
		
	case Calendar.SUNDAY:
		weekday = "�Ͽ���";
		break;

	}
	int hour = calendar.get(Calendar.HOUR);
	int minute = calendar.get(Calendar.MINUTE);
	
	System.out.print(year+"�� ");
	System.out.print(month + "�� ");
	System.out.print(day + "�� ");
	System.out.print(weekday + " ");
	System.out.print(hour + "�� " );
	System.out.print(minute + "��");
	}

}
