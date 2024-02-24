package isithalloween;

import java.util.Scanner;

public class Isithalloween {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	String[] input = scanner.nextLine().split(" ");
	int day = Integer.parseInt(input[1]);
	
	switch(input[0]) {
	case "DEC":
	    if (day == 25) {
		System.out.println("yup");
	    } else {
		System.out.println("nope");
	    }
	    break;
	case "OCT":
	    if (day == 31) {
		System.out.println("yup");
	    } else {
		System.out.println("nope");
	    }
	    break;
	   default:
	       System.out.println("nope");
	       break;
	}
	
	scanner.close();
    }
}
