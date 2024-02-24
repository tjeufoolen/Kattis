package spavanac;

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int hour = scanner.nextInt();
	int minutes = scanner.nextInt();
	
	if ((minutes - 45) < 0) {
	    if (hour == 00) {
		hour = 23;
	    } else {
		hour -= 1;
	    }
	    
	    minutes -= 45;
	    minutes = 60 - Math.abs(minutes);
	} else {
	    minutes -= 45;
	}
	
	System.out.println(hour + " " + minutes);
	
	scanner.close();
    }
}
