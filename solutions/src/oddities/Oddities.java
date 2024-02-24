package oddities;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int totalTests = scanner.nextInt();
	int[] testNumbers = new int[totalTests];
	
	for (int i = 0; i < totalTests; i++) {
	    testNumbers[i] = scanner.nextInt();
	}
	
	for (int number : testNumbers) {
	    if (number % 2 == 0) {
		System.out.println(number + " is even");
	    } else {
		System.out.println(number + " is odd");
	    }
	}

	scanner.close();
    }
}
