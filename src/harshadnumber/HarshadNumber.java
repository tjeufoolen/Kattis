package harshadnumber;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	
	int[] numbers = new int[input.length()];
	for (int i=0; i<input.length(); i++) {
	    numbers[i] = Integer.parseInt(input.split("")[i]);
	}
	
	int divideNumber = 0;
	for (int i=0; i< numbers.length; i++) {
	    divideNumber += (int) numbers[i];
	}
//	System.out.println("divideNumber: " + divideNumber);
	
	int result = Integer.parseInt(input) % divideNumber;
//	System.out.println("result: " + result);
	if (result == 0) {
	    System.out.println(Integer.parseInt(input));
	} else {
	    System.out.println(Integer.parseInt(input) + (divideNumber - result)); 
	}
	
	scanner.close();
    }
}
