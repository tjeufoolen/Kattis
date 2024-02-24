package printer3d;

import java.util.Scanner;

public class Printer {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int str = sc.nextInt();
		
		int neededDays = str;
		
		if (str > 3 ) {
			int totalDaysToMakePrinters = (int) Math.sqrt(str);
			System.out.println("totalDaysToMakePrinters: " + totalDaysToMakePrinters);
			int totalPrinters = (int) Math.ceil((str / 2) - 1);
			System.out.println("totalPrinters: " + totalPrinters);
			
			if (totalPrinters <= str) {
				neededDays = totalDaysToMakePrinters + 1; 
				System.out.println("neededDays: " + neededDays);
			} else {
				neededDays = totalDaysToMakePrinters + 2; // Add 2 if it can't print everything in 1 day
				System.out.println("neededDays: " + neededDays);
			}
		}
		
		System.out.println(neededDays);
	}
}
