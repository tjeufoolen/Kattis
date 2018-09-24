package datum;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

public class Datum {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2009);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month - 1);
		
		// Get weekday name
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        DateFormatSymbols dfs = new DateFormatSymbols();
        System.out.println(dfs.getWeekdays()[weekday]);
	}
}